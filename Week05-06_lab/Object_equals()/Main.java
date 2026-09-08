public class Main{
    public static void main(String[] args) {
        Student s1 = new Student ("Misbah", 18);
        Student s2 = new Student ("Misbah", 18);
        Student s3 = null;
        Integer i = 27;
        // before: return (this.name == s.name && this.age == s.age);
        //false because it compares ref
        System.out.println(s1.equals(s2)); 
        // Before: if( obj == null) return false;
        // gives NullPointerException
        System.out.println(s1.equals(s3)); 
        System.out.println(s1.equals(i));
        
    }
}