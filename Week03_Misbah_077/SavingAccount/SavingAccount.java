public class SavingAccount {
    // since static shared by every account 
    // one change here affects all objects
    private static double annualInterestRate;

    private double savingBalance;

    public SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    // Adds one month's worth of interest based on the current shared rate
    public void calculateMonthlyInterest() {
        this.savingBalance += this.savingBalance * (annualInterestRate / 12);
    }

    // Static because it changes something that belongs to the class, not one account
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

   
    public String toString() {
        return "$" + savingBalance;
    }
}