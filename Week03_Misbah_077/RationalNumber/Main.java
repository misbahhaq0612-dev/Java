public class Main {
    public static void main(String[] args) {
        Rational a = new Rational(8, 2);
        Rational b = new Rational(76, 41);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Rational sum = a.add(b);
        System.out.println("a + b = " + sum);
        System.out.println("Simplified: " + sum.simplify());

        Rational difference = a.subtract(b);
        System.out.println("a - b = " + difference);
        System.out.println("Simplified: " + difference.simplify());

        Rational product = a.multiply(b);
        System.out.println("a * b = " + product);
        System.out.println("Simplified: " + product.simplify());

        Rational quotient = a.divide(b);
        System.out.println("a / b = " + quotient);
        System.out.println("Simplified: " + quotient.simplify());
    }
}