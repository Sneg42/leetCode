package medium;

import java.util.Stack;

public class SimplifyPath {

    public String simplifyPath(String path){
        String[] vals = path.split("/");
        Stack<String> s = new Stack();

        for (String dir: vals) {
            if (dir.length() == 0 || dir.equals(".")){
                continue;
            }
            else if (dir.equals("..")){
                if (!s.isEmpty())
                    s.pop();
            }
            else
                s.push(dir);
        }
        String res = "";
        while (!s.isEmpty()){
            res = "/" + s.pop() + res;
        }
        return res.length() == 0 ? "/" : res;
    }
}
