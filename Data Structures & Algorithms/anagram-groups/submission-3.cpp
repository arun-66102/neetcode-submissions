class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> mp;
        vector<vector<string>> res;

        for(string s:strs){
            int fm[26] = {0};
            for(char ch:s){
                fm[ch-'a']++;
            }

            string key;
            for(int i:fm){
                key += to_string(i) + "#";
            }
            mp[key].push_back(s);
        }

        for(auto it:mp){
            res.push_back(it.second);
        }
        return res;
    }
};
