import java.util.ArrayList;

public class JSTest {

    private String testName;
    private String js;
    private String functionName;
    private ArrayList<Object> params;

    public JSTest(String testName, String js, String functionName, ArrayList<Object> params) {
        this.testName = testName;
        this.js = js;
        this.functionName = functionName;
        this.params = params;
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

    public ArrayList<Object> getParams() {
        return params;
    }
}
