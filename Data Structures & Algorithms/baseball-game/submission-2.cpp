class Solution {
public:
    int calPoints(vector<string>& operations) {
        int res = 0;
        stack<int> st;
        for(auto s:operations){
            if(!st.empty() && s == "D"){
                int f = st.top();
                st.push(f*2);
            }else if(!st.empty() && s == "+"){
                int s = st.top();
                st.pop();
                int f = st.top();
                st.pop();
                int t = f+s;
                st.push(f);
                st.push(s);
                st.push(t);
                //cout << f << s << t << st.top() << endl;
            }else if(!st.empty() && s == "C"){
                st.pop();
            }else{
                st.push(stoi(s));
            }
        }

        while(!st.empty()){
            //cout << st.top() << endl;
            res += st.top();
            st.pop();
        }
        return res;
    }
};