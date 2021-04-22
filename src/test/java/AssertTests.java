import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.junit.Assert.assertEquals;


public class AssertTests extends Object {
    @Rule
    public ErrorCollector rc = new ErrorCollector();

    @Test
    public void assertionTest() {

        rc.addError(new RuntimeException("added RuntimeEx"));
        System.out.println("test start" + this.getClass().getName());
        int a = 5;
        int b = 6;
        Object o = null;


        MyTest test = new MyTest("abv");
        SecondTestClass sc = new SecondTestClass();
        sc.type = "abv";

        String s1 = "abv";
        String s2 = "abv";
        String s3 = null;

        try {
            Assert.assertEquals("Check numbers: ", a, b);
        } catch (Throwable e) {
            rc.addError(e);
        }
        try {
            Assert.assertEquals("Check second nums: ", a, 7);
        } catch (Throwable e) {
            rc.addError(e);
        }
       /* Assert.assertEquals(test, sc);
        Assert.assertEquals(s1, s2);

        Assert.assertNotNull(null);
        Assert.assertNull(null);

        Assert.assertTrue(5 != 5);
        Assert.assertFalse(5 == 6);

        System.out.println("test ends");
        Assert.fail("End of the test");*/

    }

    @Test
    public void calculateSum() {

        assertEquals("10 + 10 = 20",20, MyTest.sum(10,10));
        assertEquals("10 + 20 = 30",30, MyTest.sum(20,10));
        assertEquals("10 + 30 = 40",40, MyTest.sum(30,10));
        assertEquals("10 + 40 = 50",50, MyTest.sum(-40,10));
    }
}
