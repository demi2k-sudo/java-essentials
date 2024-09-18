import java.util.Arrays;

public class LargestNumberFinder {

    public String largestNumber(int[] nums) {
        String[] array = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b));
        if (array[0].equals("0")) {
            return "0";
        }
        StringBuilder largest = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            largest.append(array[i]);
        }
        return largest.toString();
    }

    public static void main(String[] args) {
        LargestNumberFinder finder = new LargestNumberFinder();

        // Test case 1
        int[] nums1 = {10, 2};
        System.out.println("Largest number for {10, 2}: " + finder.largestNumber(nums1));

        // Test case 2
        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println("Largest number for {3, 30, 34, 5, 9}: " + finder.largestNumber(nums2));

        // Test case 3
        int[] nums3 = {1};
        System.out.println("Largest number for {1}: " + finder.largestNumber(nums3));

        // Test case 4
        int[] nums4 = {10, 2, 0};
        System.out.println("Largest number for {10, 2, 0}: " + finder.largestNumber(nums4));

        // Test case 5
        int[] nums5 = {0, 0};
        System.out.println("Largest number for {0, 0}: " + finder.largestNumber(nums5));
    }
}
