class ListNode {
    int val;
    ListNode next;

    // Constructor to create a new node
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SpiralMatrix {

    // Recursive DFS function to fill the matrix in a spiral order
    void dfs(int i, int j, int[][] result, ListNode head, int dir) {
        if (head == null) return;

        if (dir == 1) { // Moving right
            if (j + 1 < result[i].length && result[i][j + 1] == -1) {
                result[i][j] = head.val;
                dfs(i, j + 1, result, head.next, 1);
            } else {
                result[i][j] = head.val;
                dfs(i + 1, j, result, head.next, 2);
            }
        } else if (dir == 2) { // Moving down
            if (i + 1 < result.length && result[i + 1][j] == -1) {
                result[i][j] = head.val;
                dfs(i + 1, j, result, head.next, 2);
            } else {
                result[i][j] = head.val;
                dfs(i, j - 1, result, head.next, 3);
            }
        } else if (dir == 3) { // Moving left
            if (j - 1 >= 0 && result[i][j - 1] == -1) {
                result[i][j] = head.val;
                dfs(i, j - 1, result, head.next, 3);
            } else {
                result[i][j] = head.val;
                dfs(i - 1, j, result, head.next, 4);
            }
        } else if (dir == 4) { // Moving up
            if (i - 1 >= 0 && result[i - 1][j] == -1) {
                result[i][j] = head.val;
                dfs(i - 1, j, result, head.next, 4);
            } else {
                result[i][j] = head.val;
                dfs(i, j + 1, result, head.next, 1);
            }
        }
    }

    // Function to initialize the matrix and start the DFS
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];

        // Initialize the matrix with -1 (indicating empty cells)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = -1;
            }
        }

        // Start DFS from the top-left corner and move right initially
        dfs(0, 0, result, head, 1);
        return result;
    }

    // Helper function to print the matrix
    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                if (val == -1) {
                    System.out.print("null ");
                } else {
                    System.out.print(val + " ");
                }
            }
            System.out.println();
        }
    }

    // Main method to test the spiralMatrix function
    public static void main(String[] args) {
        SpiralMatrix spiralMatrixTest = new SpiralMatrix();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        // Define the matrix size
        int m = 3, n = 4;

        // Call the spiralMatrix function
        int[][] resultMatrix = spiralMatrixTest.spiralMatrix(m, n, head);

        // Print the resulting matrix
        System.out.println("Resulting Spiral Matrix:");
        spiralMatrixTest.printMatrix(resultMatrix);
    }
}
