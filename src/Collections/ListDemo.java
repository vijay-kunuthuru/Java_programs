package Collections;
import java.util.*;
public class ListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Aplle");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        //Insert at index
        arrayList.add(1,"avacado");

        System.out.println("ArrayList : "+ arrayList);
        System.out.println("Element of index 2 : "+ arrayList.get(2));

        //Vector synchronized Arraylist (legacy)
        List<String> vector = new Vector<>();
        vector.add("one");
        vector.add("two");

        System.out.println("Vector : "+ vector);

        //common list operations
        arrayList.remove("Banana");
        arrayList.set(0, "Apricot");//replace element

        System.out.println("Modified AllaryList : "+ arrayList);
        System.out.println("Contains Cherry? "+arrayList.contains("Cherry"));
        System.out.println("Size : "+ arrayList.size());
    }
}
