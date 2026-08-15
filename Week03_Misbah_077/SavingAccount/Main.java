public class Main {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(4500.00);
        SavingAccount saver2 = new SavingAccount(7000.00);

        SavingAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("After 4% interest:");
        System.out.println("Saver 1 = " + saver1);
        System.out.println("Saver 2 = " + saver2);

        SavingAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("After 5% interest:");
        System.out.println("Saver 1 = " + saver1);
        System.out.println("Saver 2 = " + saver2);
    }
}