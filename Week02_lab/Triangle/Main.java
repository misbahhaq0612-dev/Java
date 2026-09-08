public class Main{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(7.0);
        Triangle t3 = new Triangle(12.0, 10.0);
        Triangle t4 = new Triangle(3.0, 5.0, 4.0);
        Triangle t5 = new Triangle(t2);

        System.out.println("Triangle 3 perimeter: " + t3.perimeter());
        System.out.println("Triangle 5 perimeter: " + t5.perimeter());

        System.out.println("Triangle 2 is right-angled: " + t2.isRightAngled());
        System.out.println("Triangle 4 is right-angled: " + t4.isRightAngled());
        System.out.println("Triangle 5 is right-angled: " + t5.isRightAngled());

        System.out.println("Total number of Triangle objects: "+ t1.objectCount());
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

    }
}