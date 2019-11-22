import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSTest {

    private String testName;
    private String expectedResult;
    private List<Object> params;

    public JSTest(String testName, String js, Object[] params) {
        this.testName = testName;
        this.expectedResult = js;
        this.params = Arrays.asList(params);
    }

    public String getTestName() {
        return testName;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public List<Object> getParams() {
        return params;
    }
}
