class CustomStack {
    int[] stack;
    int idx=-1;
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        stack=new int[maxSize];
    }
    
    public void push(int x) {
        if(idx==maxSize-1){
            return;
        }
        idx++;
        stack[idx]=x;
    }
    
    public int pop() {
        if(idx==-1){
            return -1;
        }
        int val=stack[idx];
        idx--;
        return val;
    }
    
    public void increment(int k, int val) {
        int limit=Math.min(k,maxSize);
        for(int i=0;i<limit;i++){
            stack[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */