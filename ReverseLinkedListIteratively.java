public class ReverseLinkedListIteratively

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;


}
