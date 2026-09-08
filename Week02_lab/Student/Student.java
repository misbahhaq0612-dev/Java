import java.util.Scanner;
public class Student{
     private String name;
    private double test1;
    private double test2;

public Student(String name){
    this.name = name;
    this.test1 = 0;
    this.test2 = 0;
}

public void printName(){
    System.out.println(name);
}

public void inputGrades(){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter test 1 score of " + name + ": ");
        test1 = sc.nextDouble();
        while(test1 < 0 || test1 > 100){
            System.out.println("Invalid score!!");
            System.out.print("Enter test 1 score of " + name + " again: ");
            test1 = sc.nextDouble();
        }
        
        System.out.print("Enter test 2 score of " + name + ": ");
        test2 = sc.nextDouble();
        while(test2 < 0 || test2 > 100){
            System.out.println("Invalid score");
            System.out.print("Enter test 2 score of " + name + " again: ");
            test2 = sc.nextDouble();
        }}

public double getAverage(){
    return (test1 + test2)/2;
}

public String getName(){
    return name; 
}

public String toString(){
    return "Name: " + name + " Test1: " + test1 + " Test2: " + test2;
    
}}

    