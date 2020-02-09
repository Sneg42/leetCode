package hard;

import helpFunctions.HelpFunction;

public class SolveSudoku {

    private boolean checkHorizont(char[][] board, int row, char numb){
        for (int col = 0; col < 9; col++) {
            if (board[row][col] == numb)
                return false;
        }
        return true;
    }

    private boolean checkVertic(char[][] board, int col, char numb){
        for (int row = 0; row < 9; row++) {
            if (board[row][col] == numb)
                return false;
        }
        return true;
    }

    private boolean checkBox(char[][] board, int row, int col, char numb){
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        int endRow = startRow + 3;
        int endCol = startCol + 3;
        for (;startRow < endRow; startRow++) {
            startCol = col / 3 * 3;
            for (; startCol < endCol; startCol++) {
                if (board[startRow][startCol] == numb){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char numb){
        return (checkHorizont(board, row, numb) &&
                checkVertic(board, col, numb) &&
                checkBox(board, row, col, numb));
    }

    private boolean solve(char[][] board, int row, int col){
        if (row == 9)
            return true;
        if (board[row][col] != '.'){
            if (col == 8){
                if (solve(board, row + 1, 0))
                    return true;
            }
            else {
                if (solve(board, row, col + 1))
                    return true;
            }
        }
        else{
            for (char numb = '1'; numb <= '9' ; numb++) {
                if(isValid(board, row, col , numb)){
                    board[row][col] = numb;
                    if (col == 8){
                        if (solve(board, row + 1, 0))
                            return true;
                    }
                    else {
                        if (solve(board, row, col + 1))
                            return true;
                    }
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board){
        solve(board, 0, 0);
    }
}
