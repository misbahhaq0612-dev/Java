 public class RationalNumber{
    private int n;
    private int d;

public RationalNumber(int n, int d) {
    if (d == 0) {
        throw new IllegalArgumentException("Denominator cannot be zero.");
    }
        this.n = n;
        this.d = d;
}

public int getNumerator() {
        return n;
}

public int getDenominator() {
        return d;

}
public RationalNumber add(RationalNumber obj) {
// Cross multiplying --> (a/b) + (c/d) = (a*d + c*b) / (b*d)
        int newNumerator = this.n * obj.d + obj.n * this.d;
        int newDenominator = this.d * obj.d;

// Simplifying by finding the common factor of n and d
        int gcd = this.gcd1(newNumerator, newDenominator);
// create a new object in heap storing the new n and d, so that originals are untouched
        return new RationalNumber(newNumerator / gcd, newDenominator / gcd);
}

public RationalNumber subtract(RationalNumber obj) {
// Cross multiplying --> (a/b) - (c/d) = (a*d - c*b) / (b*d)
        int newNumerator = this.n * obj.d - obj.n * this.d;
        int newDenominator = this.d * obj.d;

// Simplifying by finding the common factor of n and d      
        int gcd = this.gcd2(newNumerator, newDenominator);
// create a new object in heap storing the new n and d, so that originals are untouched
        return new RationalNumber(newNumerator / gcd, newDenominator / gcd);
}

public int gcd1(int a, int b) {
// base case when b is 0 a is the the gcd
        if (b == 0) {
            return Math.abs(a); // to ensure that the gcd is always +ve
        }
        return gcd1(b, a % b); // b as the dividend and a%b as the divisor
}

public int gcd2(int a, int b){
    while(b != 0) {
        int r; 
        r = a % b; // calculate the remainder
        a = b; // move b into a
        b = r; // move r into b
    }
    return Math.abs(a); // to ensure that the gcd is always +ve
}

public String toString() {
        return this.n + "/" + this.d;
    }
}