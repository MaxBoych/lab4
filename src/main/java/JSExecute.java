import java.util.ArrayList;
import java.util.List;

public class JSExecute {

    private String testName;
    private String expectedResult;
    private Object[] params;
    private String result;
    private boolean isExpected;

    public JSExecute(String testName, String expectedResult, Object[] params,
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

    public Object[] getParams() {
        return params;
    }

    public String getResult() {
        return result;
    }

    public boolean isExpected() {
        return isExpected;
    }
}
