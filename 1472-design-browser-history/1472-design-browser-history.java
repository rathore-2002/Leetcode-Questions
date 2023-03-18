class BrowserHistory {
    
    Stack<String> history = new Stack<>();
    Stack<String> future = new Stack<>();
    public BrowserHistory(String homepage) {
        history.add(homepage);
        future.clear();
    }
    
    public void visit(String url) {
        history.add(url);
        future.clear();
    }
    
    public String back(int steps) {
        while (steps > 0 && history.size() > 1) {
            future.add(history.pop());
            steps--;
        }
        return history.peek();
    }
    
    public String forward(int steps) {
        while (steps > 0 && future.size() > 0) {
            history.add(future.pop());
            steps--;
        }
        return history.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */