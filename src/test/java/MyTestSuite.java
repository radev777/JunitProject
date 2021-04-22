import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({
        AssertTests.class ,
        JUnitannotations.class ,
        ParameterizedTests.class})

public class MyTestSuite {

}
