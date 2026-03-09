class MyQueue {
    private Stack<Integer> first;               
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.isEmpty()){
            int popped = first.pop();
            second.push(popped);          
        }
        int removed = second.pop();        
        while(!second.isEmpty()){
            int pushed = second.pop();     
            first.push(pushed);
        }
        return removed;
    }
    
    public int peek() {
        while(!first.isEmpty()){   
            int popped = first.pop();
            second.push(popped);
        }
        int peeked = second.peek();

       while(!second.isEmpty()){
            int pushed = second.pop();
            first.push(pushed);
        }
        return peeked;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}
