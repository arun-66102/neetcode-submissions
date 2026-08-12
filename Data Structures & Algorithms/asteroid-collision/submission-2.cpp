class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        vector<int> res;
        stack<int> st;

        for(int i:asteroids){
            bool exploded = false;
            while(!st.empty() && st.top() > 0 && i < 0){
                if(abs(st.top()) < abs(i)){
                    st.pop();
                    continue;
                }else if(abs(st.top()) == abs(i)){
                    st.pop();
                    exploded = true;
                    break;
                }else{
                    exploded = true;
                    break;
                }
            }
            if(!exploded) st.push(i);
        }

        while(!st.empty()){
            res.push_back(st.top());
            st.pop();
        }

        reverse(res.begin(),res.end());
        return res;
    }
};