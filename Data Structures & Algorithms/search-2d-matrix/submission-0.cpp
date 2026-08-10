class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        for(vector<int> arr:matrix){
            if(bs(arr,target)){
                return true;
            }
        }
        return false;
    }
    bool bs(vector<int>& mat, int target){
        int l = 0;
        int r = mat.size()-1;

        while(l <= r){
            int mid = l+(r-l)/2;
            if(mat[mid] == target){
                return true;
            }else if(mat[mid] > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return false;
    }
};
