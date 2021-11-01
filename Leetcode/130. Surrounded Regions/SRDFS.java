class Solution
{
    public void solve(char[][] board)
    {
        int rows = board.length;
        int cols = board[0].length;
        for(int i = 0; i < cols; i++)
        {
            if(board[0][i] == 'O')
                DFS(board,0,i);
            if(board[rows-1][i] == 'O')
                DFS(board,rows-1,i);
        }
        for(int i = 0; i < rows; i++)
        {
            if(board[i][0] == 'O')
                DFS(board,i,0);
            if(board[i][cols-1] == 'O')
                DFS(board,i,cols-1);
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(board[i][j] == 'O')
                    board[i][j] = 'X';
                else if(board[i][j] == '*')
                    board[i][j] = 'O';
            }
        }
    }
    void DFS(char[][] board, int i, int j)
    {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O')
        {
            return;
        }
        board[i][j] = '*';
        DFS(board, i + 1, j);
        DFS(board, i - 1, j);
        DFS(board, i, j + 1);
        DFS(board, i, j - 1);
    }
}