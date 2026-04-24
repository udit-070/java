public class Demo1 {
    public static void main(String[] args){

        String s1 = "Ja" + "va";
        String s2 = "Java";

        System.out.println(s1 == s2); // true because both the allocations are occuring in the compile time. Hence both get stored in the String pool. And in the string pool, when s2 is created bothe s1 and s2 have same values. So, the value gets copied and we get true as answer.

        String s3 = "Hello";
        String s4 = s3; // Assignment operation occurs at compiletime.

        System.out.println(s3 == s4); // true as the thing happens in compile time only and gets created in the string pool.

        String s5 = "Hello";
        String s6 = s5 + " World"; // this concatenation happens in runtime
        String s7 = "Hello World"; // this occurs in compile time
        
        System.out.println(s6 == s7); // false

        String s8 = "Hello";
        s8 = "World";

        System.out.println(s8); // World --> because the hello value gets overriden and garbage collector cleans it up after sometime

        String s9 = new String("Hello"); // Occurs in Runtime
        String s10 = "Hello"; // Happens in Compiletime

        System.out.println(s9 == s10); // false

    }
}
