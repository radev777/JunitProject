import org.junit.*;

public class JUnitannotations {

    @BeforeClass
    public static void mainSetUp(){
        System.out.println("run one time in the begin if the test suite");
    }
    @Before
    public void setUp(){
        System.out.println("run before each test");
    }

    @AfterClass
    public static void mainTearDown(){
        System.out.println("run one time in the end if the test suite");
    }
    @After
    public void tearDown(){
        System.out.println("run after each test");
    }

    @Test
    public void sum() {
        System.out.println("TEST1  : Sum of these 2 num: 5 + 5 = " + 10);
    }

    @Test
    public void sum2() {
        System.out.println("TEST2  :  Sum of these 2 num: 3 + 5 = " + 8);
    }

    @Ignore("Has s defect :  pok:2134354")
    @Test
    public void test3() {
        System.out.println("TEST3");
    }

    @Ignore
    @Test(timeout = 500)
    public void test4() {
        System.out.println("TEST3 started.");
        while (true){

        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test5() {
        System.out.println("TEST5 started.");
        int[] r = new int[3];
        r[4]= 6;
        MyTest t = new MyTest(null);
    }

}
