class MinStack {
public:
    stack<int> st;
    multiset<int> ms;
    MinStack() {}
    
    void push(int val) {
        st.push(val);
        ms.insert(val);
    }
    
    void pop() {
        ms.erase(ms.find(st.top()));
        st.pop();
    }
    
    int top() {
        return st.top();
    }
    
    int getMin() {
        return *ms.begin();
    }
};