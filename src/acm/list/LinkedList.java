package acm.list;

public class LinkedList {
    ListNode head;

    public void printList() {
        ListNode h = head;
        while(h != null) {
            System.out.print(h.data);
            if (h.hasNext()) {
                System.out.print("->");
            }
            h = h.next;
        }
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        myList.head.next = n2;
        n2.next = n3;
        myList.printList();
    }

}