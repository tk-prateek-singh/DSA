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
    public ListNode oddEvenList(ListNode head) {
        // ListNode d1=new ListNode(-1);
        // ListNode d2=new ListNode(-1);
        // ListNode t1=d1;
        // ListNode t2=d2;
        // ListNode temp=head;
        // if(head==null || head.next==null){
        //     return head;
        // }
        // while(temp!=null && temp.next!=null){
        //     t1.next=temp;
        //     t1=t1.next;
        //     t2.next=temp.next;
        //     t2=t2.next;
        //     temp=temp.next.next;
        // }
        // if(temp!=null){
        //     t1.next=temp;
        //     t1=t1.next;
        // }
        // t2.next=null;
        // t1.next=d2.next;
        // return d1.next;
        ListNode ans=new ListNode(-1);
        ListNode curr=ans;
        ListNode temp=head;
        int len=findSize(head);
            for(int i=1;i<=len;i++){
            if(i%2!=0){
                curr.next=new ListNode(temp.val);
                curr=curr.next;
            }
            temp=temp.next;
        }
        temp=head;
            for(int i=1;i<=len;i++){
            if(i%2==0){
                curr.next=new ListNode(temp.val);
                curr=curr.next;
            }
            temp=temp.next;
        }  
        return ans.next;     
    }
    public int findSize(ListNode head){
        ListNode t=head;
        int size=0;
        while(t!=null){
            t=t.next;
            size++;
        }
        return size;
    }
}