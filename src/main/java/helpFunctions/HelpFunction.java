package helpFunctions;

import java.util.Arrays;

public class HelpFunction {
    public static void print2DArr(int[][] arr){

        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
//        System.out.println("\n");
    }

    public int [][]copy2DArray(int [][]arr){
        int [][]current = new int [arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                current[i][j]=arr[i][j];
        return current;
    }

    public static Integer [][]copy2DArrayToInteger(int [][]arr){
        Integer [][]current = new Integer [arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                current[i][j]=arr[i][j];
        return current;
    }
}
