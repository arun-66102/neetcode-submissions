class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] b = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j] = '.';
            }
        }

        bt(b,res,0);
        return res;
    }

    public void bt(char[][] b, List<List<String>> res, int r){
        if(r == b.length){
            List<String> cp = new ArrayList<>();
            for(char[] f:b){
                cp.add(new String(f));
            }
            res.add(cp);
            return;
        }

        for(int c = 0;c<b.length;c++){
            if(isafe(b,r,c)){
                b[r][c] = 'Q';
                bt(b,res,r+1);
                b[r][c] = '.';
            }
        }
    }

    public boolean isafe(char[][] b, int r, int c){
        for(int i=r-1;i>=0;i--){
            if(b[i][c] == 'Q') return false;
        }
        for(int i = r-1, j = c-1; i>=0 && j>=0; i--,j--){
            if(b[i][j] == 'Q') return false;
        }
        for(int i = r-1, j = c+1; i>=0 && j<b.length;i--,j++){
            if(b[i][j] == 'Q') return false;
        }
        return true;
    }
}
