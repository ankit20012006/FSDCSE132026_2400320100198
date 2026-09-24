class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionExample {

    static void checkAmount(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative!");
        } else {
            System.out.println("Amount entered is valid: " + amount);
        }
    }

    public static void main(String[] args) {
        double amount = -500;

        try {
            checkAmount(amount);
        } catch (NegativeAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("The program is coded by Ankit Dwivedi, 2400320100198");
        System.out.println("Program continues...");
    }
}