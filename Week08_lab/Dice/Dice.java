public class Dice{
    private int sides;
    private int value;
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


public int myNextnt(int sides){
    return (int)(Math.random() * sides) + 1;
}

public int roll(){
    value = myNextnt(sides);
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
}}