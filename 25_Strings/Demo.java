public class Demo {
    public static void main(String[] args) {
        String s1 = "Hello"; // literal method
        String s2 = "Hello";
        System.out.println(s1 == s2); // true because when we declare strings in literal way, it creates a string pool amd in the string pool the objects and values get reused. if two strings have same values, then both the string refer to the same place in the string pool.
    
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3 == s4); // false because when we decalre strings using the new keyword, the objects are getting directly in the heap memory. In the heap memory, no String pool is created so no object value is reused. then the reference is getting compared and both the strings have different references, it is showing false.
    
    
    }
}
