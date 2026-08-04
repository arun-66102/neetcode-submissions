class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> cm = new HashMap<>();
        for(int n:nums){
            if(!cm.containsKey(n)) cm.put(n,0);
            cm.put(n,cm.get(n)+1);
        }
        Map<Integer,List<Integer>> rm = new HashMap<>();
        for(int n:cm.keySet()){
            int cnt = cm.get(n);
            if(!rm.containsKey(cnt)) rm.put(cnt,new ArrayList<>());
            rm.get(cnt).add(n);
        }
        int[] res = new int[k];
        int index = 0;
        for(int pc = nums.length;pc>=1;pc--){
            if(rm.containsKey(pc)){
                for(int n:rm.get(pc)){
                    if(index<k){
                        res[index++]=n;
                    }else{
                        break;
                    }
                }
            }
            if(index>=k){
                break;
            }
        }
        return res;
    }
}
