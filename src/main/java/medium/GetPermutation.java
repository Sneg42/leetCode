package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GetPermutation {

    public int factorial(int n){
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }
    public void find_value(StringBuilder res,  List list, int n, int k){
        int comb = factorial(n - 1);
        int i = 0;
        int start_pos = 0;
        while (i < k - comb){
            start_pos++;
            i += comb;
        }
        res.append(list.get(start_pos));
        list.remove(start_pos);
        if (n > 1){
            find_value(res, list, n - 1, k - start_pos * comb);
        }
    }
    public String getPermutation(int n, int k){
        int arr[] = new int[n];
        List<Integer> nums = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        StringBuilder res = new StringBuilder();
        find_value(res, nums, n, k);

        return res.toString();
    }
}
