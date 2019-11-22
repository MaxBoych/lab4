public class JSTestMessage {
    private String testName;
    private String js;
    private String functionName;
    private JSTest test;

    public JSTestMessage(String testName, String js,
                         String functionName, JSTest test) {
        this.testName = testName;
        this.js = js;
        this.functionName = functionName;
        this.test = test;
    }

    public String getTestName() {
        return testName;
    }

    public String getJs() {
        return js;
    }

    public String getFunctionName() {
        return functionName;
    }

    public JSTest getTest() {
        return test;
    }
}
