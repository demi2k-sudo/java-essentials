public class BitFlipCounter {

    public static int minBitFlips(int start, int goal) {
        int count = 0;
        int difference = start ^ goal;
        while (difference != 0) {
            count += difference & 1;
            difference = difference >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int start = 10; // example value
        int goal = 7;   // example value
        System.out.println(minBitFlips(start, goal));  // Output the result
    }
}
