package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpGameIV {

    private void setValue(int i, List<Integer> dp){
        for (int j = i; j > 1; j--) {
            if (dp.get(j - 1) > dp.get(j)){
                dp.set(j-1, dp.get(j) + 1);
            }
            else
                break;
        }
        for (int j = i; j < dp.size()-1; j++) {
            if (dp.get(j + 1) > dp.get(j)){
                dp.set(j+1, dp.get(j) + 1);
            }
            else
                break;
        }
    }

    private void jump(int[] arr, int i, List<Integer> dp, int prev){

        if (i == arr.length || dp.get(i) < prev){
//            if (i != arr.length && dp.get(i) < prev )
//                jump(arr, i + 1, dp, dp.get(i));
            return ;
        }

//        if (dp.get(i) < prev) {
//            jump(arr, i + 1, dp, dp.get(i));
//            return ;
//        }
        if( dp.get(i) > prev){
            dp.set(i, prev + 1);
            //setValue(i, dp);
        }
        int j = i;
        while (++j < arr.length) {
            if (arr[i] == arr[j] && dp.get(j) >= dp.get(i) + 1) {
//                dp.set(j, dp.get(i) + 1);
//                setValue(j, dp);
                jump(arr, j, dp, dp.get(i));
            }
        }


        if (i != 0 && dp.get(i - 1) >= dp.get(i) + 1)
            jump(arr, i - 1, dp, dp.get(i));
        jump(arr, i + 1, dp, dp.get(i));
    }

    public int minJumps(int[] arr){
        System.out.println(Arrays.toString(arr));
        List<Integer> dp = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            dp.add(i, i);
        }
        jump(arr, 0, dp, 0);
        if (dp.size() == 0)
            return 0;
        System.out.println(dp.toString());
        return dp.get(dp.size() - 1);
    }
}
