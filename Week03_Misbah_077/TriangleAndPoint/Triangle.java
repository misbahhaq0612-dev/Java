public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private static int count = 0;

    // Default constructor
    public Triangle() {
        this.a = null;
        this.b = null;
        this.c = null;
        count++;
    }

    // Parameterized constructor
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        count++;
    }

    // Copy constructor
    public Triangle(Triangle t) {
        this.a = t.a;
        this.b = t.b;
        this.c = t.c;
        count++;
    }

    // Getters
    public Point getA() {
        return this.a;
    }

    public Point getB() {
        return this.b;
    }

    public Point getC() {
        return this.c;
    }

    public static int getCount() {
        return count;
    }

    // Setters
    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    // Side lengths
    public double getSideA() {
        return a.distance(b);
    }

    public double getSideB() {
        return b.distance(c);
    }

    public double getSideC() {
        return c.distance(a);
    }

    public double halfPerimeter() {
        return (getSideA() + getSideB() + getSideC()) / 2;
    }

    public double area() {
        double s = halfPerimeter();
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    public boolean isValid() {
        return (area() > 0);
    }

    public String triangleType() {
        double sideA = getSideA();
        double sideB = getSideB();
        double sideC = getSideC();
        return (sideA == sideB && sideB == sideC) ? "Equilateral"
             : (sideA == sideB || sideB == sideC || sideA == sideC) ? "Isosceles"
             : "Scalene";
    }

    public void display() {
        System.out.println("PointA: " + a + "\n" + "PointB: " + b + "\n" + "PointC: " + c + "\n" + "Count: " + count);
    }

    
    public String toString() {
        String str = "PointA " + a + "\n" + "PointB " + b + "\n" + "PointC " + c + "\n" + "Count: " + count;
        return str;
    }
}