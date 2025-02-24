package LinkedList;

public class DoubleValues {
    /*

    Double Values of a Linked List

     */

    static ListNode DoubleListFn(ListNode head){
        ListNode current = head;

        while (current != null){
            current.val = current.val*2;
            current = current.next;
        }

        return head;

    }

    public static void main(String[] main){

        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);

        ListNode.printList(list);
        ListNode.printList(DoubleListFn(list));
    }
}
