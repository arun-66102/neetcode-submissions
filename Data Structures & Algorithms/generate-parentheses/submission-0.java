class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder st = new StringBuilder();
        backtrack(0,0,n,res,st);
        return res;
    }

    public void backtrack(int on, int cn, int n, List<String> res, StringBuilder st){
        if(on == cn && on == n){
            res.add(st.toString());
            return;
        }
        if(on < n){
            st.append('(');
            backtrack(on+1,cn,n,res,st);
            st.deleteCharAt(st.length()-1);
        }
        if(cn < on){
            st.append(')');
            backtrack(on,cn+1,n,res,st);
            st.deleteCharAt(st.length()-1);
        }
    }
}
