package submission07;

import java.util.HashSet;

public class ClassCollectionFramework1 {
    public static void main(String[] args) {
        // Create two HashSets
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Add elements to the first HashSet
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        // Add elements to the second HashSet
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(9);
        set2.add(10);

        // Find common elements and print them
        set1.retainAll(set2);
        System.out.println("Common elements in set1 and set2 : " + set1);
        
        HashSet<Integer> set3 = new HashSet<>();
        HashSet<Integer> set4 = new HashSet<>();
        
     // Add elements to the first HashSet
        set3.add(20);
        set3.add(5);
        set3.add(-45);
        set3.add(100);
        set3.add(30);

        // Add elements to the second HashSet
        set4.add(98);
        set4.add(-45);
        set4.add(20);
        set4.add(5);
        set4.add(35);

        // Find common elements and print them
        set3.retainAll(set4);
        System.out.println("Common elements in set3 and set4 : " + set3);
    }
}