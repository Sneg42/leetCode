package easy;

public class CountAndSay {
        public String countAndSay(int n){
            if (n <= 1)
                return "1";
            String res = countAndSay(n-1);
            StringBuilder s = new StringBuilder();
            int ct;
            char [] c = res.toCharArray();
            for(int i=0; i < c.length; i++){
                ct = 1;
                while (i < c.length - 1 && c[i] == c[i+1]){
                    i++;
                    ct++;
                }
                s.append(ct + "" + c[i]);
            }
            return s.toString();
        }


    public static void main(String[]args){
        CountAndSay test = new CountAndSay();
        System.out.println(test.countAndSay(4));
    }
}
