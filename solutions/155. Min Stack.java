class MinStack {
    
    Stack<Integer> S;
    Stack<Integer> mStack;
​
    /** initialize your data structure here. */
    public MinStack() {
        S = new Stack<Integer>();
        mStack = new Stack<Integer>();
​
    }
    
    public void push(int x) {
        S.push(x);
        if(mStack.isEmpty() || x <= mStack.peek())
            mStack.push(x);
        else 
            mStack.push(mStack.peek());
    }
    
    public void pop() {
        int x = S.pop();
        mStack.pop();
    }
    
    public int top() {
        return S.peek();
    }
    
    public int getMin() {
        return mStack.peek();
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
