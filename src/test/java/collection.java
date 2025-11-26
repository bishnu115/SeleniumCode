import java.util.ArrayList;
import java.util.Collections;

public class collection {

    public static   void hectrogenious(){
        ArrayList al = new ArrayList();// hectrogenious data
        al.add("Banana");
        al.add(100);
        al.add(19.67);
        al.add('w');

        System.out.println("Before sorting: " + al);// [Banana, 100, 19.67, w]
        System.out.println(" the size is: "+al.size());
    }

    public static void main(String[] args) {

        hectrogenious();
    }
}