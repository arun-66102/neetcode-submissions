class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int tot=0,l=0;
        int res=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            tot+=nums[r];
            while(tot>=target){
                res = Math.min(r-l+1,res);
                tot-=nums[l];
                l++;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}