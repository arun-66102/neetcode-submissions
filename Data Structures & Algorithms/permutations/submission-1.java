class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        boolean[] pk = new boolean[nums.length];
        bt(nums,perm,res,pk);
        return res;
    }

    public void bt(int[] nums, List<Integer> perm, List<List<Integer>> res, boolean[] pk){
        if(perm.size() == nums.length){
            res.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!pk[i]){
                perm.add(nums[i]);
                pk[i] = true;
                bt(nums,perm,res,pk);
                perm.remove(perm.size()-1);
                pk[i] = false;
            }
        }
    }
}
