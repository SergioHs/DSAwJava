package LinkedList;

public class TraverseList {
    /*
        traverse a linked list
     */

    public static void TraverseListFn(ListNode head){
        ListNode current = head;
        System.out.println("(List:)");
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println("(End)");
    }

    public static void main(String[] args){

        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);

        TraverseListFn(list);

    }
}
