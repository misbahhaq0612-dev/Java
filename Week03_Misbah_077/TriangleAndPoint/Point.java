public class Point {
    private double x;
    private double y;
    private static int count = 0;
    
public Point(){
    this.x = x;
    this.y = y;
    count++;
}

public Point(double x, double y){
    this.x = x;
    this.y = y;
    count++;
   
}

public Point(Point p){
    this.x = p.x;
    this.y = p.y;
    count++;
}

public static int getCount(){
    return count;
}

public double getX(){
    return this.x;
}

public double getY(){
    return this.y;
}

public void setX(double x){
    this.x = x;
}

public void setY(double y){
    this.y = y;
}

public double distance(Point p){
    return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
}

public void display(){
  System.out.println("Point: (" + this.x + ", " + this.y + ")" + "\n" + "Count: " + count);
}

public String toString(){
    String str = "Point: (" + this.x + ", " + this.y + ")" + "\n" + "Count: " + count;
    return str;
    
}}
