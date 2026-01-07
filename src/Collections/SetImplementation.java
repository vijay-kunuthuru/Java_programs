package Collections;

import java.util.*;

public class SetImplementation {
    public static void main(String[] args) {
        Set<String> hashSet =new HashSet<>();
        hashSet.add("red");
        hashSet.add("blue");
        hashSet.add("Green");
        hashSet.add("red"); // Duplicates won't allowed

        System.out.println("Hashset : "+hashSet);

        //LinkedHashSet -  maintains insertion order
        Set<String> linkedHashset = new LinkedHashSet<>();
        linkedHashset.add("first");
        linkedHashset.add("Second");
        linkedHashset.add("Third");
        System.out.println("LinkedHashSet : "+ linkedHashset);

        //TreeSet -  sorted order, implements NavigableSet
        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(50);
        treeSet.add(10);
        System.out.println("TreeSet (sorted) : "+treeSet);
        //Navigable operations
        NavigableSet<Integer> navSet =(TreeSet<Integer>) treeSet;
        System.out.println("First : "+navSet.first());
        System.out.println("Last : "+navSet.last());
        System.out.println("Lower than 50 : "+navSet.lower(50));
        System.out.println("Higher than 50 : "+navSet.higher(50));
        System.out.println("decending : "+navSet.descendingSet());
    }
}
