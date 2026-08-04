class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        HashMap<Integer,List<Integer>> rm = new HashMap<>();
        for(int i:mp.keySet()){
            int cnt = mp.get(i);
            rm.putIfAbsent(cnt,new ArrayList<>());
            rm.get(cnt).add(i);
        }
        int[] res = new int[k];
        int idx = 0;
        for(int i=nums.length;i>=1;i--){
            if(rm.containsKey(i)){
                for(int n:rm.get(i)){
                    if(idx < k){
                        res[idx++] = n;
                    }
                }
            }
            if(idx >= k){
                break;
            }
        }
        return res;
    }
}