class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String s:strs){
            int[] chmp = new int[26];
            for(char ch:s.toCharArray()){
                chmp[ch-'a']++;
            }
            String key = Arrays.toString(chmp);
            mp.putIfAbsent(key,new ArrayList<>());
            mp.get(key).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
