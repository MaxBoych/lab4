import java.util.ArrayList;

public class JSTest {

    private String testName;
    private String expected;
    private String functionName;
    private ArrayList<Object> params;

    public JSTest(String testName, String expected, String functionName, ArrayList<Object> params) {
        this.testName = testName;
        this.expected = expected;
        this.functionName = functionName;
        this.params = params;
    }

    public String getTestName() {
        return testName;
    }

    public String getExpected() {
        return expected;
    }

    public String getFunctionName() {
        return functionName;
    }

    public ArrayList<Object> getParams() {
        return params;
    }
}
