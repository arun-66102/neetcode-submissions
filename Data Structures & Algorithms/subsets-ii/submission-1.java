class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subt = new ArrayList<>();
        bt(nums,subt,res,0);
        return res;
    }

    public void bt(int[] nums, List<Integer> subt, List<List<Integer>> res, int i){
        if(i == nums.length){
            res.add(new ArrayList<>(subt));
            return;
        }
        subt.add(nums[i]);
        bt(nums,subt,res,i+1);
        subt.remove(subt.size()-1);
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
        bt(nums,subt,res,i+1);
    }
}
