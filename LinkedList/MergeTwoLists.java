package LinkedList;

public class MergeTwoLists {
    /*
    Statement: Given two sorted linked lists, merge them into one sorted linked list.
    Input:
    list1 = [1 → 3 → 5]
    list2 = [2 → 4 → 6]
    Output:
    [1 → 2 → 3 → 4 → 5 → 6]
    Complexity: O(n + m) time, O(1) space
     */

    public static ListNode MergeTwoListsFn(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null){
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }




    public static void main(String[] string){

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode mergedList = MergeTwoListsFn(list1, list2);

        ListNode.printList(mergedList);
    }

}

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
