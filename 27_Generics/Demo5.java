public class Demo5 {
    // Now we want to know can we bound the generics like we can restrict what values T can take like? --> only numbers or only strings
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.value = 5;
        System.out.println(b1.value.getDouble());
    }
}

class Box<T extends Number> { // This is known as Upper Bound.
    T value;
}

// We know that by default T takes objects. But now i want to bound T to only Numbers. 
