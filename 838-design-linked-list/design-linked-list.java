class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    // Node temp=head;
    public void addAtHead(int val) {
        Node curr=new Node(val);
        if(head==null){
            head=curr;
        }
        else{
            curr.next=head;
            head=curr;
            
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp=head;
        Node curr=new Node(val);
        if(head==null){
            head=curr;
        }
        else{
            while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=curr;
        
        }
        size++;
    }
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }
        if(head==null){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        Node temp=head;
        Node curr=new Node(val);
        if(index==0){
            curr.next=temp;
            head=curr;
            size++;
            return;
        }
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        curr.next=temp.next;
        temp.next=curr;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */