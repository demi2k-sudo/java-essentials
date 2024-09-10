import java.util.Arrays;
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ModifyLinkedList {

    // Method to modify the list by removing nodes with values present in the array nums
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Create a set from the nums array for quick lookup
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        // Iterate through the list and remove nodes whose values are in the set
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (set.contains(temp.next.val)) {
                // Bypass the node to remove it
                temp.next = temp.next.next;
            } else {
                // Move to the next node
                temp = temp.next;
            }
        }

        // Check if the head itself needs to be removed
        if (head != null && set.contains(head.val)) {
            return head.next;
        }
        return head;
    }

    // Helper method to build a linked list from an array of values
    public ListNode buildList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode curr = head;
        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }
        return head;
    }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the modifiedList method
    public static void main(String[] args) {
        ModifyLinkedList test = new ModifyLinkedList();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        int[] listValues = {1, 2, 3, 4, 5};
        ListNode head = test.buildList(listValues);

        // Array of values to remove from the linked list
        int[] nums = {2, 4};
        
        // Print the original list
        System.out.println("Original List:");
        test.printList(head);

        System.out.println("Array with the elements to remove : "+Arrays.toString(nums));

        // Modify the list
        head = test.modifiedList(nums, head);

        // Print the modified list
        System.out.println("Modified List:");
        test.printList(head);
    }
}
