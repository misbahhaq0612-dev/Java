import java.util.Random;
public class Dice{
    private int sides;
    private int value;
    // better practice than by making a new Random object every time you roll the dice
    Random rng = new Random(); 
public Dice(int sides){
    this.sides = sides;
    this.value = 0;
}

public void setValue(int value){
    this.value = value;
}

public void setSides(int sides){
    this.sides = sides;
}
public int roll(){ // called from player.java roll()
    // Random rng = new Random(); --> not recommended 
    value = rng.nextInt(1,7);
    return value;
}

public int getSides(){
    return sides;
}

public int getValue(){
    return value;
}

@Override 
public String toString(){
    return " Sides: " + this.sides + " Value: " + this.value;
}

}