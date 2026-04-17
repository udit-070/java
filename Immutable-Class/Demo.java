
// Immutable class is a class which can not be changed. We can ensure immutability by adding final keyword to the class name and private and final keywords to the varibale names.

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(21, "Udit");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        
    }
}

final class Student {
    private final int age;
    private final String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
   public int getAge() {
       return this.age;
    }
    public String getName() { 
        return this.name;
    }
    }
