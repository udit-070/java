// package basicOOP;



public class basicOOP {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Udit";
        s1.age = 20;
        s1.dept = "CSE";
        s1.markAttendance();
        s1.printName();

        Student s2 = new Student();
        s2.name = "Abhi";
        s2.age = 19;
        s2.dept = "Electrical";
        s2.markAttendance();
        s2.printName();


    }
    // Class is the blueprint to create objects.
    static class Student {
        String name;
        int age;
        String dept;
        void markAttendance(){
            System.out.println("Attendance is marked by " +name);
        }
        void printName(){
            System.out.println("Hi! My name is " + name + " I am from department " +dept);
        }
    }
}