public class Main{
    public static void main (String[]args){
        Calculator casio = new Calculator();
         System.out.println("Addition: " +  casio.add(7,8));
         System.out.println("Substraction: " +  casio.sub(6,23));
         System.out.println("Multiplication: " +  casio.mul(46,4));
         System.out.println("Division: " +  casio.div(118,12));
         System.out.println("Power: " +  casio.power(2,-8));
         System.out.println("Modulus: " +  casio.mod(8,3));
         System.out.println("Minimum: " +  casio.minimum(8,3,3,4,6,9));
         System.out.println("Maximum: " +  casio.maximum(8,3,3,4,6,9));
         
    }
}