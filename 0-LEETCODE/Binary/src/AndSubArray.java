public class AndSubArray {

    /**
     * This method finds the longest subarray where every element is equal to the maximum element
     * in the array. The assumption here is that the bitwise AND of any two numbers cannot exceed
     * the maximum element in the array, because the result of an AND operation is always less than
     * or equal to both numbers involved.
     *
     * @param nums an array of integers
     * @return the length of the longest subarray consisting of the maximum element in the array
     */
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        // Find the maximum element in the array
        for (int i : nums) {
            max = Math.max(max, i);
        }

        int count = 0;
        // Find the longest contiguous subarray where all elements are equal to 'max'
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] == max) {
                int temp = 1;
                // Continue checking for contiguous elements equal to 'max'
                while ((l + 1 < nums.length) && (nums[l + 1] == nums[l])) {
                    temp++;
                    l++;
                }
                // Update count with the longest subarray length
                if (temp > count) count = temp;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        AndSubArray obj = new AndSubArray();
        int[] nums = {1, 2, 2, 3, 3, 3, 2, 2, 1}; // Example array

        int result = obj.longestSubarray(nums);
        System.out.println("The longest subarray with maximum element is of length: " + result);
    }
}
