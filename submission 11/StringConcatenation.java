package submission11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatenation {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = new ArrayList<String>();
        strings.add("Indranil");
        strings.add("Dutta");
        strings.add("Join");
        strings.add("Class");
        strings.add("Everyday");

        // Concatenate strings using Stream API
        String concatenatedString = strings.stream()
                                           .collect(Collectors.joining(" ")); 

        // Print the concatenated string
        System.out.println("Concatenated String: " + concatenatedString);
    }
}

