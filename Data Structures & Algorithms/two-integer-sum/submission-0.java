class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> pm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(pm.containsKey(diff)){
                return new int[]{pm.get(diff),i};
            }
            pm.put(nums[i],i);
        }
        return new int[]{};
    }
}
