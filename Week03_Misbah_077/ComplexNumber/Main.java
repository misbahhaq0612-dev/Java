public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(9.5, 7.7);
        Complex b = new Complex(1.2, 3.1);
        Complex c = new Complex(4,8);
        Complex d = new Complex(8,1);
        Complex e = new Complex(0,9);
        
        System.out.println("Complex number a: " + a);
        System.out.println("Complex number b: " + b);
        System.out.println("Complex number c: " + c);
    
        System.out.println("Conjugate: " + c.conjugate());
        System.out.println("a + b = " + a.add(b));
        System.out.println("a - b = " + a.sub(b));
        System.out.println(d.describe());
        System.out.println(e.describe());
    }
}