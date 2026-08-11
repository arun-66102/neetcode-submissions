class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int l = *max_element(weights.begin(),weights.end());
        int r = accumulate(weights.begin(),weights.end(),0);
        int res = r;

        while(l <= r){
            int mid = (l+r)/2;
            if(cap(weights,days,mid)){
                res = min(res,mid);
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return res;
    }

private:
    bool cap(vector<int>& w, int d, int c){
        int s = 1;
        int cc = c;

        for(int i:w){
            if(cc-i < 0){
                s++;
                if(s > d){
                    return false;
                }
                cc = c;
            }
            cc -= i;
        }
        return true;
    }
};