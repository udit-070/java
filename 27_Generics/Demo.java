
import java.util.ArrayList;
public class Demo {
    public static void main(String[] args) {
       ArrayList list = new ArrayList();
       list.add("Hello");
       list.add(123);
        list.add(3.14);

        String str = (String) list.get(0);
        String str1 = (String) list.get(1);



        // This shows Class Cast Exception. Whenever we create an arraylsit, it can accept values of any datatypes and we can retreive values of any type from it. Due to this, the problems of Typesafety and manual casting arise.
    }
}