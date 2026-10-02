class MinStack {
    Stack<Integer>st;
    Stack<Integer>minStack;
    public MinStack() {
        st=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(minStack.size()==0){
            minStack.push(value);
        }
        else{
            minStack.push(Math.min(value,minStack.peek()));
        }
        
    }
    
    public void pop() {
        if(st.size()!=0){
            st.pop();
            minStack.pop();
        }
        
    }
    
    public int top() {
        if(st.size()!=0){
            return st.peek();
        }
        else{
            return -1;
        }
        
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */