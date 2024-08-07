package msg;

import java.io.*;
import java.util.*;

public class AssetManager {

    public static void manageInvestment()
    //
    // modifies an investment.
    //
    {
        try {
            boolean done = false;                // terminates while-loop
            boolean found = false;                // tells if investment is found
            String input;                            // buffer for line of characters
            char choice;                            // user's choice
            Investment investment = new Investment();    // investment to be modified

            while (!found && !done) {
                System.out.println("Please enter the number of the investment to be" +
                        " updated (12 digits): ");

                input = UserInterface.getString();

                found = investment.find(input);

                if (!found) {
                    System.out.println("Investment " + input + " was not found.");
                    System.out.println("Would you like to enter another investment idn?");

                    choice = UserInterface.getChar();

                    if (choice == 'n') {
                        done = true;
                    }
                }
            }

            if (!found) {
                return;
            }

            while (!done) {
                UserInterface.clearScreen();

                System.out.println("\t           UPDATE INVESTMENTS\n\n");
                System.out.println("\t MARTHA STOCKTON GREENGAGE FOUNDATION\n\n");
                System.out.println("\t        1. Update investment name\n");
                System.out.println("\t        2. Update expected return\n");
                System.out.println("\t        3. Exit to investment menu\n\n");
                System.out.println("Enter your choice and press <ENTER>: ");

                choice = UserInterface.getChar();
                ManageInvestmentOptions manageInvestmentOptions = ManageInvestmentOptions.fromChar(choice);
                if (manageInvestmentOptions != null) {
                    done = manageInvestmentOptions.execute(investment);
                }

                if (!done) {
                    investment.print();
                    UserInterface.pressEnter();
                }
            }

            investment.save();
        } catch (Exception e) {
            System.out.println("***** Error: AssetManager.manageInvestment() () *****");
            System.out.println("\t" + e);
        }
    }

//----------------------------------------------------------------------------------------------------------------------------------------------------

    public static void manageMortgage()
    //
    // modifies a mortgage.
    //
    {
        try {
            boolean done = false;            // terminates while-loop
            boolean found = false;            // tells if mortgage is found
            String input;                        // buffer for line of characters
            char choice;                    // user's choice
            Mortgage mortgage = new Mortgage();    // mortgage to be modified

            while (!found && !done) {
                System.out.println("Please enter the number of the mortgage to be updated (12 digits): ");
                input = UserInterface.getString();

                found = mortgage.find(input);

                if (!found) {
                    System.out.println("Mortgage " + input + " was not found.");
                    System.out.println("Would you like to enter another mortgage?");

                    choice = UserInterface.getChar();

                    if (choice == 'n') {
                        done = true;
                    }
                }
            }

            if (!found) {
                return;
            }

            while (!done) {
                UserInterface.clearScreen();

                System.out.println("\t           UPDATE MORTGAGES\n\n");
                System.out.println("\t MARTHA STOCKTON GREENGAGE FOUNDATION\n\n");
                System.out.println("\t        1. Update mortgagee name\n");
                System.out.println("\t        2. Update price of home\n");
                System.out.println("\t        3. Update date mortgage issued\n");
                System.out.println("\t        4. Update current weekly income\n");
                System.out.println("\t        5. Update property tax\n");
                System.out.println("\t        6. Update insurance premium\n");
                System.out.println("\t        7. Update mortgage balance\n");
                System.out.println("\t        8. Exit to mortgage menu\n\n");
                System.out.println("Enter your choice and press <ENTER>: ");

                choice = UserInterface.getChar();

                ManageMortgageOptions manageMortgageOptions = ManageMortgageOptions.fromChar(choice);
                if (manageMortgageOptions != null) {
                    done = manageMortgageOptions.execute(mortgage);
                }

                if (!done) {
                    mortgage.print();
                    UserInterface.pressEnter();
                }
            }

            mortgage.save();
        } catch (Exception e) {
            System.out.println("***** Error: AssetManager.manageMortgage () *****");
            System.out.println("\t" + e);
        }

    }  // manageMortgage

//----------------------------------------------------------------------------------------------------------------------------------------------------


}