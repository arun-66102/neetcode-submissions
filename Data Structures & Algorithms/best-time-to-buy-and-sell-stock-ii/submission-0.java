class Solution {
    public int maxProfit(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                cnt+=(nums[i]-nums[i-1]);
            }
        }
        return cnt;
    }
}