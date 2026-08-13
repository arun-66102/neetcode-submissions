class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& t) {
        stack<int> st;
        vector<int> res(t.size());
        for(int i=0;i<t.size();i++){
            while(!st.empty() && t[i] > t[st.top()]){
                int c = st.top();
                st.pop();
                res[c] = i-c;
            }
            st.push(i);
        }
        return res;
    }
};
