package msg;

public enum ManageInvestmentOptions {
    UPDATE_INVESTMENT_NAME('1') {
        @Override
        public boolean execute(Investment investment) {
            investment.updateInvestmentName();
            return false;
        }
    },
    UPDATE_EXPECTED_RETURN('2') {
        @Override
        public boolean execute(Investment investment) {
            investment.updateExpectedReturn();
            return false;
        }
    },
    EXIT('3') {
        @Override
        public boolean execute(Investment investment) {
            return true;
        }
    },
    EXIT_2('\n') {
        @Override
        public boolean execute(Investment investment) {
            return true;
        }
    };

    private final char value;

    ManageInvestmentOptions(char value) {
        this.value = value;
    }

    public abstract boolean execute(Investment investment);

    public static ManageInvestmentOptions fromChar(char value) {
        for (ManageInvestmentOptions manageInvestmentOptions : ManageInvestmentOptions.values()) {
            if (manageInvestmentOptions.value == value) {
                return manageInvestmentOptions;
            }
        }
        System.out.println("\n\nNot a valid choice\n");
        UserInterface.pressEnter();
        return null;
    }
}
