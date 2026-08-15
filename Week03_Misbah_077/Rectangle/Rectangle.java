public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Rejects anything outside (0, 20) and falls back to 1.0 instead of leaving a bad value
    public void setLength(double length) {
        this.length = (length > 0.0 && length < 20.0) ? length : 1.0;
    }

    public void setWidth(double width) {
        this.width = (width > 0.0 && width < 20.0) ? width : 1.0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double perimeter() {
        return 2 * length + 2 * width;
    }

    public double area() {
        return length * width;
    }

 
    public String toString() {
        String str = "Length: " + length + ", Width: " + width +
               ", Perimeter: " + perimeter() + ", Area: " + area();
        return str;
    }
}