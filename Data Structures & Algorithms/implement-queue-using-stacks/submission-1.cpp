class MyQueue {
    stack<int> st;
    stack<int> st1;
public:
    MyQueue() {}
    
    void push(int x) {
        while(!st.empty()){
            st1.push(st.top());
            st.pop();
        }
        st.push(x);
        while(!st1.empty()){
            st.push(st1.top());
            st1.pop();
        }
    }
    
    int pop() {
        int peek = st.top();
        st.pop();
        return peek;
    }
    
    int peek() {
        return st.top();
    }
    
    bool empty() {
        return st.empty();
    }
};