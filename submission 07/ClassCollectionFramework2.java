package submission07;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ClassCollectionFramework2 {
    public static void main(String[] args) {
        // Create a HashMap to store student names and IDs
        HashMap<String, String> hm = new HashMap<>();

        // Add student names and IDs to the HashMap
        String[] keys = {"Anand", "Ramesh", "Kiran"};
        String[] values = {"ID102", "ID101", "ID100"};
        for (int i = 0; i < keys.length; i++) {
            hm.put(keys[i], values[i]);
        }

        // Sort the HashMap by student name
        Map<String, String> sortedHm = new TreeMap<>(hm);

        // Print the sorted student names and IDs
        for (Map.Entry<String, String> entry : sortedHm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
