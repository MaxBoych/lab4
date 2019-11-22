import java.util.ArrayList;

public class JSTestMessage {
    private String testName;
    private String expected;
    private String functionName;
    private JSTest test;

    public JSTestMessage(String testName, String expected,
                         String functionName, JSTest test) {
        this.testName = testName;
        this.expected = expected;
        this.functionName = functionName;
        this.test = test;
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

    public JSTest getTest() {
        return test;
    }
}
