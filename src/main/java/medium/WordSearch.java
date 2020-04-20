package medium;

public class WordSearch {
    public boolean exist(char [][] board, String word){

        if (word == null || board == null || word.length() == 0)
            return false;

        boolean visited[][] = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)){
                    if (existUntil(board, word, visited, i, j, 0)){
                        return true;
                    }
                }else{
                    continue;
                }
            }
        }
        return false;
    }

    private boolean existUntil(char[][] board, String word, boolean[][] visited, int i, int j, int charIndex){
        if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1 || visited [i][j])
            return false;
        if (board[i][j] != word.charAt(charIndex))
            return false;
        if (charIndex == word.length() - 1)
            return true;
        if (charIndex < word.length() && board[i][j] == word.charAt(charIndex)){
            visited[i][j] = true;

            if (existUntil(board, word, visited, i + 1, j, charIndex + 1)
                    || existUntil(board, word, visited, i - 1, j, charIndex + 1)
                    || existUntil(board, word, visited, i, j + 1, charIndex + 1)
                    || existUntil(board, word, visited, i, j - 1, charIndex + 1))
                return true;

            visited[i][j] = false;
        }
        return false;
    }
}
