public class Main{
    public static void main (String[]args){
        Car audi = new Car();
        Car bmw = new Car();

        audi.start();
        bmw.start();
        System.out.println(audi.moveFast(20)); 
        System.out.println(audi.moveSlow(5));
        System.out.println(audi.reverse(5));
        System.out.println(bmw.nitroBoost(20, 15, 5));
        System.out.println(bmw.refuel(50));

        audi.stop();
        bmw.stop();
        
    }
}