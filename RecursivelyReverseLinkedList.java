public class RecursivelyReverseLinkedList {

        private ListNode newHead = null;

        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            reverse(head);
            return newHead;
        }

        private ListNode reverse(ListNode head) {
            if (head.next == null) {
                newHead = head;
                return head;
            }
            ListNode tail = reverse(head.next);
            tail.next = head;
            head.next = null;
            return head;

    }

}
