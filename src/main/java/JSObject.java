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

    @JsonProperty(Config.TESTS)
    private JSTest[] tests;

    public JSObject(String packageId, String jsScript,
                    String functionName, JSTest[] tests) {
        this.packageId = packageId;
        this.jsScript = jsScript;
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
