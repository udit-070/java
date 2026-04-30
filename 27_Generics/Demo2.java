public class Demo2 {
    public static void main(String[] args) {

        Box b1 = new Box(10);
        Box b2 = new Box("Hello");
        Box b3 = new Box(true);

        //Downcasting
        Integer s1 = (Integer) b1.getValue();
        String s2 = (String) b2.getValue();
        Boolean s3 = (Boolean) b3.getValue();

        String s = (String) b1.getValue();
        System.out.println(s);


// The problem is that the error is not getting in the compile time. It is getting shown in the runtime. 

    }
}

class Box{
   private Object value;

    Box(Object value){
        this.value = value;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
