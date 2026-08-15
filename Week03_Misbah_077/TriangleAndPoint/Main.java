public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 7);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(1, 4);

        Triangle t1 = new Triangle(p1, p2, p3);
        Triangle t2 = new Triangle(t1);

        p1.display();
        t1.display();

        System.out.println(p2);
        System.out.println(t2);
        
        System.out.println("Triangle type: " + t1.triangleType());
    }}

