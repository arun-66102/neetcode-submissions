class Solution {
    public int R,C;
    public boolean[][] v;
    public boolean exist(char[][] board, String word) {
        R = board.length;
        C = board[0].length;
        v = new boolean[R][C];

        for(int r = 0;r<R;r++){
            for(int c = 0;c<C;c++){
                if(dfs(board,word,r,c,0)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, String word, int r, int c, int i){
        if(i == word.length()){
            return true;
        }
        if(r<0 || c<0 || r>=R || c>=C || word.charAt(i) != board[r][c] || v[r][c]){
            return false;
        }

        v[r][c] = true;
        boolean res = dfs(board,word,r-1,c,i+1) || dfs(board,word,r+1,c,i+1) || dfs(board,word,r,c-1,i+1) || dfs(board,word,r,c+1,i+1);
        v[r][c] = false;
        return res;
    }
}
