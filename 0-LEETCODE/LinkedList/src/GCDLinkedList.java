class ListNode {
    int val;
    ListNode next;

    // Constructor to create a new node
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class GCDLinkedList {

    // Function to calculate the GCD of two numbers
    public int gcd(int a, int b) {
        if (a == 1 || b == 1) {
            return 1;
        }
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    // Function to insert GCD nodes between nodes in the linked list
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            // Create a new node with GCD value and link it between two nodes
            ListNode node = new ListNode(gcd(temp.val, temp.next.val), temp.next);
            temp.next = node;
            temp = temp.next.next;
        }
        return head;
    }

    // Helper function to print the linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        GCDLinkedList test = new GCDLinkedList();

        // Creating a linked list: 12 -> 15 -> 18
        ListNode head = new ListNode(12);
        head.next = new ListNode(15);
        head.next.next = new ListNode(18);

        System.out.println("Original List:");
        test.printList(head);

        // Call the function to insert GCDs between nodes
        head = test.insertGreatestCommonDivisors(head);

        System.out.println("\nList After Inserting GCDs:");
        test.printList(head);
    }
}
