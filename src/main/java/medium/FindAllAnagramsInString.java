package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p){
        int m = s.length();
        int n = p.length();

        List<Integer> ans = new ArrayList<>();

        if (m < n )
            return ans;

        int [] requred = new int[26];
        int [] current = new int[26];

        for (int i = 0; i < n; i++) {
            requred[p.charAt(i) - 'a']++;
            current[s.charAt(i) - 'a']++;
        }
        for (int i = n; i < m; i++) {
            if (Arrays.equals(requred, current))
                ans.add(i-n);
            current[s.charAt(i-n) - 'a']--;
            current[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(requred, current))
            ans.add(m-n);
        return ans;
    }
}
