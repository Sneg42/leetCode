package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeStringTest {
    @Test
    public void testDecodingString(){
        DecodeString test = new DecodeString();
        String s = "3[a]2[bc]";
        System.out.println(test.decodeString(s));

        s = "2[abc]3[cd]ef";
        System.out.println(test.decodeString(s));
    }
}