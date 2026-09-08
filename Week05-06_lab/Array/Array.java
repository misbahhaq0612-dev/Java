import java.util.Arrays;
public class Array implements Cloneable {
    private int[] anArray;
    private int value;

public Array(){
    // initialize the array and value
    this.anArray = new int[] {1,2,3,4,5,6};
    this.value = 0;
}

public void increment(){
    this.value++;
    for(int i = 0; i < anArray.length; i++){
        anArray[i]++;
    }
}
@Override 
public String toString(){
    return "anArray = " + Arrays.toString(anArray) + " , value = " + value;
}


// clone method to create a shallow copy of the Array object
@Override 
public Object clone() throws CloneNotSupportedException{
    return super.clone();
}
}
