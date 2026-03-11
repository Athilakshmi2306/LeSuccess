class MinStack {
 Stack <Integer> stack=new Stack<>();
 Stack <Integer> MinStack=new Stack<>();
    public MinStack() {
        stack=new Stack<>();
        MinStack=new Stack<>();
    }
    
    public void push(int val) {
       stack.push(val);
       if(MinStack.isEmpty()||val<=MinStack.peek()){
        MinStack.push(val);
       }
    }
    
    public void pop() {
        int ele=stack.pop();
        if(ele==MinStack.peek()){
            MinStack.pop();
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return MinStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */