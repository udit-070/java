
// The previous class that i created was not so immutable. Lets see how.

public class Demo1 {
    public static void main(String[] args) {
        College c = new College("IGIT", "Sarang");
        Student s1 = new Student(21, "Udit", c);
        System.out.println(s1.getCollege().name); // IGIT

        c.name = "VSSUT"; // The name of college can be changed via College class since that class is mutable.
        System.out.println(s1.getCollege().name); // VSSUT 

        // Here you can see that despite of making  the variable collge private and final in student class, whenever we change the value of college from College class it changes its value. So the immutable class is not so immutable after all.
    }
}

// Immutable Class

class Student {
   private final int age;
   private final String name;
   private final College college;

    Student(int age, String name, College college){
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public College getCollege(){
        return this.college;
    }

}

// Mutable Class
class College {
    String name;
    String address;
    College (String name, String address){
        this.name = name;
        this.address = address;
    }
}