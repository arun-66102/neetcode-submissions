class Solution {
    public int jump(int[] nums) {
        int ms=0,tm=ms,cnt=0;
        for(int i=0;i<nums.length-1;i++){
            ms = Math.max(ms,i+nums[i]);
            if(ms>=nums.length-1){
                cnt++;
                break;
            }
            if(i==tm){
                tm=ms;
                cnt++;
            }
        }
        return cnt;
    }
}
