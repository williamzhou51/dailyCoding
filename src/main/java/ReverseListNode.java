public class ReverseListNode {
    public ListNode reverseListNode(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);

        head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        ReverseListNode reverseListNode = new ReverseListNode();
        ListNode res = reverseListNode.reverseListNode(head);
        System.out.println(res.val);
        System.out.println(res.next.val);
    }
}
