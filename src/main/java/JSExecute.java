import java.util.ArrayList;
import java.util.List;

public class JSExecute {

    private String testName;
    private String expectedResult;
    private List<Integer> params;
    private String result;
    private boolean isExpected;

    public JSExecute(String testName, String expectedResult, List<Integer> params,
                     String result, boolean isExpected) {
        this.testName = testName;
        this.expectedResult = expectedResult;
        this.params = params;
        this.result = result;
        this.isExpected = isExpected;
    }

    public String getTestName() {
        return testName;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public List<Integer> getParams() {
        return params;
    }

    public String getResult() {
        return result;
    }

    public boolean isExpected() {
        return isExpected;
    }
}
