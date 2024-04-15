package org.example;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original linked list:");
        printLinkedList(head);

        ListNode reversedHead = reverseLinkedList(head);

        System.out.println("\nReversed linked list:");
        printLinkedList(reversedHead);
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;

        while (curr != null) {
            nextNode = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr;
            curr = nextNode; // Move to the next node
        }

        return prev; // Return the new head of the reversed list
    }

    public static void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
}