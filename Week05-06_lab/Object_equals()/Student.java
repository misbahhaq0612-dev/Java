public class Student{
    private String name;
    private int age;
    
Student(String name, int age){
    this.name = name;
    this.age = age;
}

public boolean equals(Object obj ){
    
    if( obj == null)
        return false;
    // check if both classes are of type student
    // if not gives ClassCastException
    if (obj.getClass() != this.getClass())
        return false;

    Student s = (Student) obj; // typecasted Student to Obj
    return (this.name == s.name && this.age == s.age);

}
}