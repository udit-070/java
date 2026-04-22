// Before java 8, we could only declare methods in interfaces. But now we can also define methods in interfaces by using the default keyword.
// We can also overrid these default methods.

public class Demo1 {
    public static void main(String[] args){
        A b = new B();
        b.fun();
    }
}

interface A{
    void display();
    default void fun(){
        System.out.println("Hello");
    }
}

class B implements A {

    @Override
    public void display(){

    }

    @Override
    public void fun(){
        System.out.println("Fun");
    }

}