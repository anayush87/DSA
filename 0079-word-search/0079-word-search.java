class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(wordse(board,word,0,i,j)) return true;
            }
        }
        return false;
    }
    public boolean wordse(char[][] board, String word,int count,int i, int j )
    {
        if(count==word.length())
        {
            return true;
        }
         if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false;
        if (board[i][j] != word.charAt(count)) return false;
        char temp=board[i][j];
        board[i][j]='%';
        boolean found=(wordse(board,word,count+1,i+1,j)||
        wordse(board,word,count+1,i,j-1)||
        wordse(board,word,count+1,i,j+1)||
        wordse(board,word,count+1,i-1,j));
        board[i][j]=temp;
        return found;
    }
}