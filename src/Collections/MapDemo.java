package Collections;
import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        //HashMap - unordered key-value pairs, 0(1) operations
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice",25);
        hashMap.put("Bob",30);
        hashMap.put("Charlie", 35);
        hashMap.put("Alice",26);//updates existing value
        System.out.println("hashMAp: "+ hashMap);
        System.out.println("Alice's age: "+hashMap.get("Alice"));
        System.out.println("Contains Bob? "+hashMap.containsKey("Bob"));


        //LinkedHashMap - maintains insertion order
        Map<String, String> linkeedHashMap = new LinkedHashMap<>();
        linkeedHashMap.put("1", "one");
        linkeedHashMap.put("2","two");
        linkeedHashMap.put("3", "Three");
        System.out.println("LinkedHashMap: "+linkeedHashMap);

        //TreeMap - sorted by keys, implements NavigableMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "three");
        treeMap.put(1, "One");
        treeMap.put(2, "two");
        System.out.println("TreeMap (spryted by key): "+ treeMap);

        //NavigableMap operations
        NavigableMap<Integer, String> navMap= (TreeMap<Integer, String>) treeMap;
        System.out.println("First entry : "+ navMap.firstEntry());
        System.out.println("Last entry : "+navMap.lastEntry());
        System.out.println("Lower entry : "+navMap.lowerEntry(2));

        //Hashtable - synchronized HashMap (legacy)
        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("key1", "value1");
        System.out.println("Hashtable: "+ hashTable);

        //Map operations
        System.out.println("\nMap operations");
        hashMap.putIfAbsent("David",40);
        hashMap.remove("Bob");
        System.out.println("After operations: "+ hashMap);

        //Iterating over Map
        System.out.println("\nIterating using entrySet:");
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }

        System.out.println("\nIterating using keySet: ");
        for(String key : hashMap.keySet()){
            System.out.println(key + ": "+hashMap.get(key));
        }
    }
}
