public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);

        head.next = firstNode;
        firstNode.next = secondNode;

        System.out.println(secondNode.next);
    }

}
