package msg;

public enum ManageMortgageOptions {
    UPDATE_NAME('1') {
        @Override
        public boolean execute(Mortgage mortgage) {
            mortgage.updateMortgageeName();
            return false;
        }
    },
    UPDATE_PRICE('2') {
        @Override
        public boolean execute(Mortgage mortgage) {
            mortgage.updatePrice();
            return false;
        }
    },
    UPDATE_DATE('3') {
        @Override
        public boolean execute(Mortgage mortgage) {
            mortgage.updateDate();
            return false;
        }
    },
    UPDATE_WEEKLY_INCOME('4') {
        @Override
        public boolean execute(Mortgage mortgage) {
            mortgage.updateWeeklyIncome();
            return false;
        }
    },
    UPDATE_PROPERTY_TAX('5') {
        @Override
        public boolean execute(Mortgage mortgage) {
            mortgage.updatePropertyTax();
            return false;
        }
    },
    UPDATE_INSURANCE_PREMIUM('6') {
        @Override
        public boolean execute(Mortgage mortgage) {
            mortgage.updateInsurancePremium();
            return false;
        }
    },
    UPDATE_BALANCE('7') {
        @Override
        public boolean execute(Mortgage mortgage) {
            mortgage.updateBalance();
            return false;
        }
    },
    EXIT('8') {
        @Override
        public boolean execute(Mortgage mortgage) {
            return true;
        }
    },
    EXIT_2('\n') {
        @Override
        public boolean execute(Mortgage mortgage) {
            return true;
        }
    };

    private final char value;

    ManageMortgageOptions(char value) {
        this.value = value;
    }

    public abstract boolean execute(Mortgage mortgage);

    public static ManageMortgageOptions fromChar(char value) {
        for (ManageMortgageOptions option : ManageMortgageOptions.values()) {
            if (option.value == value) {
                return option;
            }
        }
        System.out.println("\n\nNot a valid choice\n");
        UserInterface.pressEnter();
        return null;
    }
}
