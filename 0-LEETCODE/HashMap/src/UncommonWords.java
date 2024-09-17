import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UncommonWords {
    public static void main(String[] args) {
        // Create an instance of the class containing uncommonFromSentences method
        UncommonWords obj = new UncommonWords();

        // Test with two example sentences
        String s1 = "apple banana orange";
        String s2 = "banana apple pear";

        // Call the method and store the result
        String[] uncommonWords = obj.uncommonFromSentences(s1, s2);

        // Print the result
        System.out.println("Uncommon words:");
        for (String word : uncommonWords) {
            System.out.println(word);
        }
    }

    // Method that finds uncommon words from two sentences
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();

        String[] words1 = s1.split(" ");
        for (String temp : words1) {
            dictionary.put(temp, dictionary.getOrDefault(temp, 0) + 1);
        }

        String[] words2 = s2.split(" ");
        for (String temp : words2) {
            dictionary.put(temp, dictionary.getOrDefault(temp, 0) + 1);
        }

        List<String> list = new ArrayList<String>();
        for (String word : dictionary.keySet()) {
            if (dictionary.get(word) == 1) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}
