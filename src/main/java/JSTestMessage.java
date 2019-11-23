public class JSTestMessage {
    private String packageId;
    private String jsScript;
    private String functionName;
    private JSTest test;

    public JSTestMessage(String packageId, String jsScript,
                         String functionName, JSTest test) {
        this.packageId = packageId;
        this.jsScript = jsScript;
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
