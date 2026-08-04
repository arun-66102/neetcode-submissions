class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int as = (n*(n+1))/2;
        for(int i:nums){
            as-=i;
        }
        return as;
    }
}
