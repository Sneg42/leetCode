package medium;

public class DecodeString {

    private int idx;
    private String s;

    public String decodeString(String s){
        this.s = s;
        idx = 0;

        return readSubString(1).toString();
    }

    private StringBuilder readSubString(int repeatTimes){
        StringBuilder sb = new StringBuilder();

        while (idx < s.length() && Character.isLetter(s.charAt(idx))){
            sb.append(s.charAt(idx++));
        }
        if(idx >= s.length() || s.charAt(idx) == ']'){
            repeatGivenTimes(sb, repeatTimes);
            if (idx < s.length())
                idx++;
            return sb;
        }
        int cnt = getNumber();
        idx++;
        sb.append(readSubString(cnt));
        if (idx < s.length()){
            sb.append(readSubString(1));
        }
        repeatGivenTimes(sb, repeatTimes);

        return sb;
    }

    public int getNumber(){
        StringBuilder num = new StringBuilder();
        while (Character.isDigit(s.charAt(idx))){
            num.append(s.charAt(idx++));
        }
        return Integer.parseInt(num.toString());
    }

    public void repeatGivenTimes(StringBuilder sb, int repeatTimes){
        String s = sb.toString();
        for (int i = 2; i <= repeatTimes; i++) {
            sb.append(s);
        }
    }
}
