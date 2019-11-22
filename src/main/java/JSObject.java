import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSObject {

    private String packageId;
    private String jsScript;
    private String functionName;
    private JSTest[] tests;

    public JSObject(String testName, String js,
                    String functionName, JSTest[] tests) {
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

    public JSTest[] getTests() {
        return tests;
    }
}
