package BasicMath.kanaiyaCodes;

import java.util.HashSet;
import java.util.Set;

public class DistinctSubstrings {

    // Method to count distinct substrings in a given string
    public static int countDistinctSubstrings(String str) {
        Set<String> substrings = new HashSet<>();

        // Loop through all possible substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substrings.add(str.substring(i, j)); // Add substring to set
            }
        }

        // Return the count of distinct substrings
        return substrings.size();
    }

    public static void main(String[] args) {
        String str = "abcab"; // Example input string
        System.out.println("Number of distinct substrings: " + countDistinctSubstrings(str));
    }
}
