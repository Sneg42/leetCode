package medium;

public class PalindromicSubstring {
    public int countSubstring(String s){
        int N = s.length(), count = 0;
        for (int center = 0; center < 2*N-1; ++center) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        return  count;
    }
}
