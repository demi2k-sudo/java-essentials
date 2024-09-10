class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LinkedListInBinaryTree {

    public boolean isSubPath(ListNode head, TreeNode root) {
        return dfs(head, head, root);
    }

    // Recursive DFS function to find if the list exists as a path in the binary tree
    boolean dfs(ListNode head, ListNode curr, TreeNode root) {
        if (curr == null) return true;  // Successfully matched the entire list
        if (root == null) return false; // Reached the end of a tree branch, no match

        // If the current node matches, move to the next node in the list
        if (curr.val == root.val) {
            curr = curr.next;
        } else if (head.val == root.val) {
            // Restart the search from the head if the current tree node value matches the list head
            head = head.next;
        } else {
            // Otherwise, reset curr to head (continue from the start of the list)
            curr = head;
        }

        // Continue DFS on the left and right subtrees
        return dfs(head, curr, root.left) || dfs(head, curr, root.right);
    }

    // Helper method to build a simple linked list for testing
    public ListNode buildList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode curr = head;
        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }
        return head;
    }

    // Helper method to build a binary tree for testing
    public TreeNode buildTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(6);
        root.right.left.right = new TreeNode(8);
        root.right.left.right.left = new TreeNode(1);
        root.right.left.right.right = new TreeNode(3);

        return root;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        LinkedListInBinaryTree test = new LinkedListInBinaryTree();

        // Create a linked list: 4 -> 2 -> 8
        int[] listValues = {4, 2, 8};
        ListNode head = test.buildList(listValues);

        // Create a binary tree
        TreeNode root = test.buildTree();

        // Test if the linked list is a sub-path in the binary tree
        boolean result = test.isSubPath(head, root);
        System.out.println("Is the linked list a sub-path in the binary tree? " + result);
    }
}
