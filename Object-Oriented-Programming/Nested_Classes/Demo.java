// package ObjectOrientedProgramming.Nested_Classes;

public class Demo {
    public static void main(String[] args) {
        
    
    // Static nested class can only access static members of outer class. 
    // Since the nested class is static means that object of inner class can be created without creating an object of the outer class. As the object of outer class is nbot created, then how will it access the non static members of the outer class.
        Outer.Inner inner = new Outer.Inner();
        inner.fun();
    }

}

class Outer {
    static int x = 4;
    int y = 5;

    static class Inner {
       static void  fun(){
        System.out.println("Hello");
            
        }
    }
}
