class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> need =  new HashMap<>();
        HashMap<Character,Integer> have = new HashMap<>();

        for(char c:s1.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

        int end=0,st=0;
        while(end<s2.length()){
            char c = s2.charAt(end);
            if(!need.containsKey(c)){
                end++;
                st=end;
                have.clear();
                continue;
            }

            have.put(c,have.getOrDefault(c,0)+1);
            while(have.get(c)>need.get(c)){
                char stch = s2.charAt(st);
                have.put(stch,have.get(stch)-1);
                st++;
            }
            int ws = (end - st)+1;
            if(ws == s1.length()){
                return true;
            }
            end++;
        }
        return false;
    }
}
