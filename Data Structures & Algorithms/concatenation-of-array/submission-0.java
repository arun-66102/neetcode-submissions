class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int i=0;
        while(i<nums.length){
            ans[i]=nums[i];
            i++;
        }
        int j=0;
        i=nums.length;
        while(i<nums.length*2){
            ans[i]=nums[j];
            i++;
            j++;
        }
        return ans;
    }
}