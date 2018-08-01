package acm.list;

public class ListNode {
    int data;
    ListNode next;
    ListNode(int d) {
        data = d;
        next = null;
    }

    public boolean hasNext() {
        return next != null;
    }
}
