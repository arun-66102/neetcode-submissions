class Solution {
    public List<List<String>> partition(String s) {
        List<String> part = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();

        bt(0,part,res,s);
        return res;
    }

    public void bt(int i, List<String> part, List<List<String>> res, String s){
        if(i == s.length()){
            res.add(new ArrayList<>(part));
            return;
        }
        for(int j = i;j < s.length();j++){
            if(ispali(s,i,j)){
                part.add(s.substring(i,j+1));
                bt(j+1,part,res,s);
                part.remove(part.size()-1);
            }
        }
    }

    public boolean ispali(String s, int i, int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}