public class XorQueries {

    // Method to compute the XOR of elements between indices for multiple queries
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] ^ arr[i];
        }
        int[] res = new int[queries.length];
        for (int k = 0; k < queries.length; k++) {
            int i = queries[k][0];
            int j = queries[k][1];
            if (i == 0) {
                res[k] = pre[j];
            } else {
                res[k] = pre[j] ^ pre[i - 1];
            }
        }
        return res;
    }

    // Main method to test xorQueries
    public static void main(String[] args) {
        XorQueries example = new XorQueries();

        // Example array and queries
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {
            {0, 1},  // XOR from index 0 to 1 => 1 ^ 3 = 2
            {1, 2},  // XOR from index 1 to 2 => 3 ^ 4 = 7
            {0, 3},  // XOR from index 0 to 3 => 1 ^ 3 ^ 4 ^ 8 = 14
            {2, 3}   // XOR from index 2 to 3 => 4 ^ 8 = 12
        };

        // Call the xorQueries method
        int[] result = example.xorQueries(arr, queries);

        // Print the results
        for (int res : result) {
            System.out.println(res);
        }
    }
}
