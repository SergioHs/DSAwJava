package LinkedList;

public class RemoveDuplicates {

    /*
        Statement: Given a sorted linked list, remove all duplicate elements so that each element appears only once.
        Input:
        head = [1 → 1 → 2 → 3 → 3]
        Output:
        [1 → 2 → 3]
        Complexity: O(n) time, O(1) space
     */

    static ListNode RemoveDuplicatesFn(ListNode head){
        if (head == null) return null;

        ListNode current = head;

        while (current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args){

        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(3);

        ListNode.printList(RemoveDuplicatesFn(list));
    }
}