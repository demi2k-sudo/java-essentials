import java.util.Arrays;

public class LongestVowelSubstring {
    public int findTheLongestSubstring(String s) {
        int[] mapy = new int[32];
        Arrays.fill(mapy, -2);
        mapy[0] = -1;

        int maxLen = 0;
        int mask = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case 'a':
                    mask ^= 1;
                    break;
                case 'e':
                    mask ^= 2;
                    break;
                case 'i':
                    mask ^= 4;
                    break;
                case 'o':
                    mask ^= 8;
                    break;
                case 'u':
                    mask ^= 16;
                    break;
            }

            int prev = mapy[mask];
            if (prev == -2) {
                mapy[mask] = i;
            } else {
                maxLen = Math.max(maxLen, i - prev);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestVowelSubstring solution = new LongestVowelSubstring();
        
        String test1 = "eleetminicoworoep";
        String test2 = "leetcodeisgreat";
        String test3 = "bcbcbc";
        
        System.out.println("Test 1: " + solution.findTheLongestSubstring(test1)); // Expected output: 13
        System.out.println("Test 2: " + solution.findTheLongestSubstring(test2)); // Expected output: 5
        System.out.println("Test 3: " + solution.findTheLongestSubstring(test3)); // Expected output: 6
    }
}
