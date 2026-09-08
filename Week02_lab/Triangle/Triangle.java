public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private static int count = 0;
// default constructor
    public Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        count++;
    }
// constructor with one parameter
    public Triangle(double x){
        this.sideA = x;
        this.sideB = x;
        this.sideC = x;
        count++;
    }
// constructor with two parameters
    public Triangle(double x, double y){
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        count++;
    }
// constructor with three parameters
    public Triangle(double a, double b, double c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        count++;
    }
// copy constructor
    public Triangle(Triangle other) {
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
        count++;
    }
// method to return the number of Triangle objects created
    public int objectCount() {
        return count;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public boolean isRightAngled() {
        double aSquared = sideA * sideA;
        double bSquared = sideB * sideB;
        double cSquared = sideC * sideC;

        return (aSquared + bSquared == cSquared) ||
               (aSquared + cSquared == bSquared) ||
               (bSquared + cSquared == aSquared);
    }

    public String toString() {
        return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }
    
}