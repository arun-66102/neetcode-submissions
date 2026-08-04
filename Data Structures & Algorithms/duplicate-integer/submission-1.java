class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int i:nums){
            if(!arr.add(i)) return true;
        }
        return false;
    }
}