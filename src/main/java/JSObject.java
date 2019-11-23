import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSObject {

    @JsonProperty(Config.PACKAGE_ID)
    private String packageId;

    @JsonProperty(Config.JS_SCRIPT)
    private String jsScript;

    @JsonProperty(Config.FUNCTION_NAME)
    private String functionName;

    @JsonProperty(Config.TEST)
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
