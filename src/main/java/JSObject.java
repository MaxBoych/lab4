import java.util.ArrayList;

public class JSObject {

    private String packageId;
    private String jsScript;
    private String functionName;
    private ArrayList<JSTest> tests;

    public JSObject(String testName, String js, String functionName, ArrayList<JSTest> tests) {
        this.packageId = testName;
        this.jsScript = js;
        this.functionName = functionName;
        this.tests = tests;
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

    public ArrayList<JSTest> getTests() {
        return tests;
    }
}
