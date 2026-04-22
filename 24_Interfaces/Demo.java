// Basic Interfaces
// Interfaces define what an object can do but do not define how it doees that

public class Demo{
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.display();
        
    }
}

interface Vehicle{
    void display();
}

class Car implements Vehicle{
    @Override
    public void display(){
        System.out.println("Car is driving");
    }
}