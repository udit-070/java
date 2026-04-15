
// Non static members of outer class can be accessed by static inner class by passing a reference of the outer class to inner class.
// This can be done by creating an object of outer class and pass it to inner class.


public class Demo1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();
        inner.fun(outer);
        
    }
}

class Outer {
    static int x = 4;
    int y;

    static class Inner {
        void fun(Outer outer){
            System.out.println(x);
            System.out.println(outer.y);
        }
    }
}
