class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> a = new HashMap<>();
        for(String s:strs){
            int[] c = new int[26];
            for(char d:s.toCharArray()){
                c[d-'a']++;
            }
            String k = Arrays.toString(c);
            a.putIfAbsent(k,new ArrayList<>());
            a.get(k).add(s);
        }
        return new ArrayList<>(a.values());
    }
}
