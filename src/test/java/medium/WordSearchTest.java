package medium;


import org.junit.Test;



public class WordSearchTest {

    @Test
    public void existTest(){
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "SEE";
        WordSearch test = new WordSearch();
        System.out.println(test.exist(board, word));
    }

}
