package submission07;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ClassHashMapRenameKey {
    public static void main(String[] args) {
        // Given HashMap
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("apples", 10);
        fruits.put("bananas", 20);
        fruits.put("mangoes", 15);
        fruits.put("oranges", 200);
        fruits.put("watermelons", 50);

        // Input key to be renamed
        String oldKey = "apples";
        String newKey = "pomegranates";

        // Check if the old key exists in the map
        if (fruits.containsKey(oldKey)) {
            int value = fruits.get(oldKey);	  // Get the value associated with the old key
            fruits.remove(oldKey);		// Remove the old key-value pair from the map
            fruits.put(newKey, value);	// Add the new key-value pair to the map
        }

        // Sort the HashMap based on keys
        Map<String, Integer> sortedFruits = new TreeMap<>(fruits);

        // Print the sorted entries
        for (Map.Entry<String, Integer> entry : sortedFruits.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}