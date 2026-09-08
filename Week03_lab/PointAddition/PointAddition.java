public class PointAddition{
    private int x; 
    private int y;

public PointAddition(int x, int y){
   this.x = x; 
   this.y = y; 

}

//  this = p1 (PointAddition calling add), obj = p2 (PointAddition passed in)
public PointAddition add(PointAddition obj){
     //creates and returns a new PointAddition object holding the sum of p1 and p2. 
     // Original p1 and p2 stay unchanged
    return new PointAddition(this.x + obj.x, this.y + obj.y);
}

public int getX(){
    return x;
}

public int getY(){
    return y;
}
}