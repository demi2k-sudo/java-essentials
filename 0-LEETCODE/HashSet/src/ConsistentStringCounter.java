import java.util.HashSet;

public class ConsistentStringCounter {
    
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allow = new HashSet<Character>();
        for(int i = 0; i < allowed.length(); i++) allow.add(allowed.charAt(i));
        
        int count = 0;
        for(String s : words) {
            boolean flag = false;
            for(int i = 0; i < s.length(); i++) {
                if(!allow.contains(s.charAt(i))) {
                    flag = true;
                    break; // break out of loop as soon as we find an invalid character
                }
            }
            if(!flag) count++; // increment if flag is still false (i.e., all characters are valid)
        }
        return count;
    }
    
    public static void main(String[] args) {
        ConsistentStringCounter counter = new ConsistentStringCounter();
        
        // Test case
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc", "abcd", "xyz"};
        
        int result = counter.countConsistentStrings(allowed, words);
        
        // Output the result
        System.out.println("Number of consistent strings: " + result);
    }
}
