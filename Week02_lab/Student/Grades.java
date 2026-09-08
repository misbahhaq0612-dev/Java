public class Grades {
    public static void main(String[] args) {
        Student s1 = new Student("Khizr");
        Student s2 = new Student("Mariyam");

        s1.inputGrades();
        s2.inputGrades();
        System.out.println("The average of " + s1.getName()+ " is " +s1.getAverage());
        System.out.println("The average of " + s2.getName()+ " is " +s2.getAverage());
        
        System.out.println(s1);
        System.out.println(s2);

    }}
