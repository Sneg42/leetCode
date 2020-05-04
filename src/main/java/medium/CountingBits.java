package medium;

public class CountingBits {
    public int[] countBits(int num){
        int[] arr = new int[num+1];
        int diff = 1;
        for (int i = 1; i <= num; i++) {
            if (i / diff > 1)
                diff *= 2;
            arr[i] = 1 + arr[i - diff];
        }
        return arr;
    }
}
