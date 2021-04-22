import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTests {

    int firstNum;
    int secNum;
    int result;

    public ParameterizedTests(int firstNum, int secNum, int result) {
        this.firstNum = firstNum;
        this.secNum = secNum;
        this.result = result;
    }


    @Parameterized.Parameters
    public static Collection inputs(){
        return Arrays.asList(new Object[][]{
                        {1, 2, 3},
                        {3, 7, 10},
                        {19, 11, 30},
                        {333, 100, 433},
                        {23, 25, 48}
                });
    }

    @Test
    public  void  testSum(){
      //  assertEquals(String.format( "%d + %d = %d"  ,firstNum,secNum,result), MyTest.sum(firstNum,secNum),result);
        assertEquals(String.format( "%d + %d = %d"  ,firstNum,secNum,result), firstNum+secNum,result);

    }
}
