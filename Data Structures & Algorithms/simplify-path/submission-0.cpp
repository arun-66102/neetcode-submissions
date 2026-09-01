class Solution {
public:
    string simplifyPath(string path) {
        vector<string> st;
        string curch;
        for(char c:path+"/"){
            if(c == '/'){
                if(curch == ".."){
                    if(!st.empty()){
                        st.pop_back();
                    }
                }else if(!curch.empty() && curch != "."){
                    st.push_back(curch);
                }
                curch.clear();
            }else{
                curch += c;
            }
        }

        string result = "/";
        for(int i=0;i<st.size();i++){
            if(i > 0){
                result += "/";
            }
            result += st[i];
        }
        return result;
    }
};