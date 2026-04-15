public class Demo3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
       // This is now the wrong way Outer.Inner inner = new Outer.Inner(); 

       // The correct way is:
       Outer.Inner inner = outer.new Inner(); 
       inner.fun();
    }
}

class Outer {

    class Inner{
        void fun(){
            System.out.println("Hello");
        }
    }
}
