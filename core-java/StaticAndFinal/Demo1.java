
// This is the code static keyword

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.College);
        System.out.println(s1.UNI);

    }
    
}

class Student {
    int age; 
    String name;
    static String College = "IGIT";
    final String UNI = "BPUT";
    
    
}
