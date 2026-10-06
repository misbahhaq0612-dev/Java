public class Main {
    public static void main(String[] args){
        Player player = new Player("Sara", 2, 6);
        player.roll();
        System.out.println("Intial total: " + player.getTotal());
        System.out.println(player);
        player.roll(1);
        System.out.println("New total: " + player.getTotal());
        System.out.println(player);
        
    }
}