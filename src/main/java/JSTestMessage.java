public class JSTestMessage {
    private String packageId;
    private String jsScript;
    private String functionName;
    private JSTest test;

    public JSTestMessage(String testName, String js,
                         String functionName, JSTest test) {
        this.packageId = testName;
        this.jsScript = js;
        this.functionName = functionName;
        this.test = test;
    }

    public String getPackageId() {
        return packageId;
    }

    public String getJsScript() {
        return jsScript;
    }

    public String getFunctionName() {
        return functionName;
    }

    public JSTest getTest() {
        return test;
    }
}
