public class Rational {
    private int numerator;
    private int denominator;

    // Defaults to 1/1 so a Rational is never left uninitialized
    public Rational() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // a/b + c/d = (ad + cb) / bd - cross-multiply the two fractions
    public Rational add(Rational obj) {
        int resultNumerator = this.numerator * obj.denominator + obj.numerator * this.denominator;
        int resultDenominator = this.denominator * obj.denominator;
        return new Rational(resultNumerator, resultDenominator);
    }

    public Rational subtract(Rational obj) {
        int resultNumerator = this.numerator * obj.denominator - obj.numerator * this.denominator;
        int resultDenominator = this.denominator * obj.denominator;
        return new Rational(resultNumerator, resultDenominator);
    }

    public Rational multiply(Rational obj) {
        return new Rational(this.numerator * obj.numerator, this.denominator * obj.denominator);
    }

    // Dividing by a fraction = multiplying by its flip (numerator/denominator swapped)
    public Rational divide(Rational obj) {
        return new Rational(this.numerator * obj.denominator, this.denominator * obj.numerator);
    }

    // Walks down from the smaller of the two numbers, looking for the
    // biggest one that divides both evenly
    public int gcd(int a, int b) {
        int smaller = (a < b) ? a : b;
        int result = 1;

        for (int divisor = smaller; divisor >= 2; divisor--) {
            if (a % divisor == 0 && b % divisor == 0) {
                result = divisor;
                break;
            }
        }

        return result;
    }

    // Returns a simplified copy of this fraction - doesn't modify the original
    public Rational simplify() {
        int divisor = gcd(numerator, denominator);
        return new Rational(numerator / divisor, denominator / divisor);
    }

       public String toString() {
        return numerator + "/" + denominator;
    }
}