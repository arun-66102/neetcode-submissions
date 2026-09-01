class Solution {
public:
    string decodeString(string s) {
        int k = 0;
        string curr;
        stack<int> cst;
        stack<string> sst;

        for(char ch:s){
            if(isdigit(ch)){
                k = (k*10)+(ch-'0');
            }else if(ch == '['){
                cst.push(k);
                sst.push(curr);
                k = 0;
                curr.clear();
            }else if(ch == ']'){
                int cnt = cst.top();
                cst.pop();
                string prev = sst.top();
                sst.pop();
                for(int i=0;i<cnt;i++){
                    prev += curr;
                }
                curr = prev;
            }else{
                curr += ch;
            }
        }
        return curr;
    }
};