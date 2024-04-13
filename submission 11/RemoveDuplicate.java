package submission11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // Sample list of strings with duplicates
        List<String> strings = Arrays.asList("Indranil", "Dutta", "Sanket", "Indranil", "Pintu", "Dutta");

        // Remove duplicates using Stream API
        List<String> uniqueStrings = strings.stream()
                                            .distinct()
                                            .collect(Collectors.toList());

        // Print the list of unique strings
        System.out.println("Original List: " + strings);
        System.out.println("List with Duplicates Removed: " + uniqueStrings);
    }
}
