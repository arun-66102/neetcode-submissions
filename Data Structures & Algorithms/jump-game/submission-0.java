class Solution {
    public boolean canJump(int[] nums) {
        int ms = 0;
        for(int i =0;i<nums.length;i++){
            ms = Math.max(ms,i+nums[i]);
            if(ms>=nums.length-1){
                return true;
            }
            if(i==ms){
                return false;
            }
        }
        return false;
    }
}
