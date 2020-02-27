import org.junit.Test;

public class TestForAll {

    @Test
    public void test1(){
        B b = new B();
        System.out.println(b.i);
    }
}
class A{
    static int i = 100;
    static
    {
         i = i-- - --i;
        System.out.println(" first " + i);
    }
}
class B extends A{
    static{
        i = --i - i--;
        System.out.println("Third " + i);
    }
}
