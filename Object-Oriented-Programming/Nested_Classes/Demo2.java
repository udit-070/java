// The same thing that we did earlier, can also be done in a different way. This can also be done by the means of constructors

public class Demo2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun();

    }
    
}

class Outer {
        static int x =4;
        int y;

    static class Inner{
        Outer outer;

        Inner(Outer outer){

            this.outer = outer;
        }

        void fun(){
            System.out.println(x);
            System.out.println(outer.y);
        }
    }
}
