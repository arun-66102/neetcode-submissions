class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> ns =  new HashSet<>();
        for(int n:nums){
            ns.add(n);
        }
        int lon=0;
        for(int i:ns){
            if(!ns.contains(i-1)){
                int len=1;
                while(ns.contains(i+len)){
                    len++;
                }
                lon = Math.max(len,lon);
            }
        }
        return lon;
    }
}
