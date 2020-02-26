package medium;

import org.junit.Test;

public class SimplifyPathTest {

    @Test
    public void simplyfyPathTest(){
        SimplifyPath test = new SimplifyPath();
        System.out.println(test.simplifyPath("/a//b////c/d//././/.."));
    }

}
