
public class Demo3 {
    public static void main(String[] args) {


        Box<Integer> b1 = new Box<>(10);
        Box<String> b2 = new Box<>("Hello");
        Box<Boolean> b3 = new Box<>(true);


        // Now, we cannot do something like downcasting and it will throw compile time error.
        // String s =(String) b1.getValue();
        // incompatible types: Integer cannot be converted to String(errors(1): 12:9-12:42) Cannot cast from Integer to StringJava(16777372)

        
    }
}


class Box<T>{  // Type Parameter

private T value;

    Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}