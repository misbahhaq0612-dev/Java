public class Main {
    public static void main (String[] args)throws CloneNotSupportedException{
        int[] source= {1,2,3,4,5,6};
        Matrix original = new Matrix(2,3,source);
        Matrix shallow = original.clone();
        Matrix deep = original.deepCopy();
        shallow.set(0,1,99);
        System.out.println("Original after shallow: " + original);
        deep.set(1,2,88);
        System.out.println("Deep copy: " + deep);
    }

}