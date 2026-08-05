class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        s = s.toLowerCase();
        String apn = "abcdefghijklmnopqrstuvwxyz1234567890";
        while(l < r){
            while(l < r && apn.indexOf(s.charAt(l)) == -1){
                l++;
            }
            while(l < r && apn.indexOf(s.charAt(r)) == -1){
                r--;
            }

            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
