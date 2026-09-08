public class Main {
    public static void main(String[] args) {
        Line lineA = new Line(7, 3, 3, 4);
        Line lineB = new Line(0, 2, 4, 9);

        Vector vectorA = new Vector(lineA);
        Vector vectorB = new Vector(lineB);

        System.out.println("Magnitude A: " + vectorA.magnitude());
        System.out.println("Dot product: " + vectorA.dotProduct(vectorB));
        System.out.println("Projection of A onto B: " + vectorA.projectionOnto(vectorB));
        System.out.println("Angle between A and B: " + vectorA.angleWith(vectorB));
    }
}