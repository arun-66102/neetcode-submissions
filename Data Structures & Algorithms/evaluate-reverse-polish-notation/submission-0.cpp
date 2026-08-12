class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> st;
        for(string s:tokens){
            if(!st.empty() && s == "+"){
                int f = st.top();
                st.pop();
                int s = st.top();
                st.pop();
                st.push(f+s);
            }else if(!st.empty() && s == "-"){
                int s = st.top();
                st.pop();
                int f = st.top();
                st.pop();
                st.push(f-s);
            }else if(!st.empty() && s == "*"){
                int f = st.top();
                st.pop();
                int s = st.top();
                st.pop();
                st.push(f*s);
            }else if(!st.empty() && s == "/"){
                int s = st.top();
                st.pop();
                int f = st.top();
                st.pop();
                st.push(f/s);
            }else{
                st.push(stoi(s));
            }
        }
        return st.top();
    }
};
