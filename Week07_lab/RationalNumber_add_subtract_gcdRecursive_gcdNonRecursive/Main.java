public class Main {
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(7, 2);
        RationalNumber r2 = new RationalNumber(9, 3);

        RationalNumber Additon = r1.add(r2);
        RationalNumber Subtraction = r1.subtract(r2);

        System.out.println("Addition: " + Additon);
        System.out.println("Subtraction: " + Subtraction);
    }
    
}
