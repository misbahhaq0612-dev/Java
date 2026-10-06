public class Player {
    private String name;
    private Dice[] dice;
    private int total; // sum of values of two sides 


public Player(String name, int count, int sides){
    this.name = name;
    // static array --> size is known
    // this line allocaes memory on heap for "array of refernces of type dice"
    this.dice = new Dice[count];
    for(int i = 0; i < this.dice.length; i++){  
    //this new creates an actual Dice object 
        this.dice[i] = new Dice(sides);
      }
    this.total = 0;
    
}

public void roll(){
    this.total = 0;
    for(int i = 0; i < this.dice.length; i++ ){
        this.dice[i].roll();
        this.total+= this.dice[i].getValue();
    }}

public int getTotal(){
    return total;
}

public void roll(int index){
    this.dice[index].roll(); // reroll only the chosen die
    this.total = 0;
    for(int i = 0; i < this.dice.length; i++ ){ 
       this.total+= this.dice[i].getValue();
    }}

public String toString(){
    // using for loop
    String str =  "Name: " + this.name + " Total: " + this.total;
    for(int i=0 ; i<this.dice.length ; i++) {
        str = str + this.dice[i] + "  ";
    }
    return str;
 }}
