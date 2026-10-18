/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=findSize(head);
        ListNode temp=head;
        if(head.next==null){
            return null;
        }
        if(size==n){
            return head.next;
        }
        for(int i=1;i<size-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
        
    }
    public int findSize(ListNode head){
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
}