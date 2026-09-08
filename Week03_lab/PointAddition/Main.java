public class Main {
    public static void main(String[] args) {

        PointAddition p1 = new PointAddition(5, 7);
        PointAddition p2 = new PointAddition(4, 1);

        //p1 written before the dot is the object on which the method is being called.
        //p2 written inside the parentheses is just an argument being passed in.
        PointAddition addition = p1.add(p2);

        
        System.out.println("Addition of two points: (" + addition.getX() + ", " + addition.getY() + ")");
        
    }
}
