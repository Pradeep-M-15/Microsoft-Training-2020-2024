class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode tail = head;
        int i;
        for(i=1;tail.next!=null;i++){
            tail=tail.next;
        }
        tail.next=head;
        k%=i;
        
        ListNode new_tail = head;
        ListNode new_head = head;
        for(int j=1;j<i-k;j++){
            new_tail=new_tail.next;
        }
        new_head = new_tail.next;
        new_tail.next = null;
        return new_head;
    }
}
