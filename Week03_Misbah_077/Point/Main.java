public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(8, 10);
        Point p2 = new Point(11, 5);

        Point p3 = new Point(p1); // copy constructor

        Point addition = p1.add(p2);
        Point subtraction = p1.sub(p2);

        
        System.out.println("Sum = " + addition);
        System.out.println("Difference = " + subtraction);
    }
}

