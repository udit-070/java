// package core-java.StaticAndFinal;

// I thought why to static if we can do the same thing using constructors. But the whole point of static is that the variable or method which is static can be accessed without creating an object. This is the code the thing that i tried to do using construcotrs. 

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Udit";
        s1.age = 21;
        
        Student s2 = new Student();
        s2.name= "Shibu";
        s2.age = 20;
        System.out.println(s1.College);
        System.out.println(s2.College);
    }
}

class Student{
    String name;
    int age;
    String College;

    Student (){
        College = "IGIT";
    }
}
