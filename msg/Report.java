package msg;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Objects;

public class Report {



    public static void printReport(String reportType)
    //
    // generates the investment report.
    //
    {
        try {
            int i = 0;            // used for screen clearing
            File itemsFile = new File(reportType + ".dat");     //investment or mortgage
            Investment tempInvestment = new Investment();
            Mortgage tempMortgage = new Mortgage();


            if (itemsFile.exists()) {
                RandomAccessFile inFile = new RandomAccessFile(itemsFile, "r");

                while (inFile.getFilePointer() != inFile.length()) {
                    //
                    // pause the screen after every three investments
                    //
                    if (((i % 3) == 0) && (i != 0)) {
                        System.out.println();
                        System.out.println();
                        System.out.println(" Press <ENTER> to view the next screen...");
                        System.in.read();
                    }

                    //
                    // display a header message after every third painting
                    //
                    if ((i % 3) == 0) {
                        UserInterface.clearScreen();

                        System.out.println();
                        System.out.println();
                        System.out.println("\t       Martha Stockton Greengage Foundation");
                        System.out.println("\t                 INVESTMENT REPORT\n");
                    }

                    System.out.println("-----------------------------------------------------------------------------");
                    if(Objects.equals(reportType, "investment")) {
                        tempInvestment.read(inFile);
                        tempInvestment.print();
                        i++;
                    } else if(Objects.equals(reportType, "mortgage")) {
                        tempMortgage.read(inFile);
                        tempMortgage.print();
                        i++;
                    }

                }

                inFile.close();

            } else {
                System.out.println("\nNo " + reportType + "s currently exist.");
            }

            UserInterface.pressEnter();

        } catch (Exception e) {
            System.out.println("***** Error: Report.printReport () *****");
            System.out.println("\t" + e);
        }

    }  // printReport


}
