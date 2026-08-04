class Solution {
        public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1, j=col; i>=0; i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }  
        
        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }

    static int count=0;

    public static void nQueens(char board[][],int row){
        if(board.length==row){
            count++;
            return;
        }


        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1);
                board[row][j]='x';
            }
        }
       
    }

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        count = 0;
        nQueens(board, 0);

        return count;
    }
}