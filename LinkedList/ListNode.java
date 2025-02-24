package LinkedList;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }

    static void printList(ListNode head){
        System.out.println("List: ");
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("(End)");
    }
}
