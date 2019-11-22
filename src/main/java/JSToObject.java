import java.util.ArrayList;

public class JSToObject {

    private String testName;
    private String js;
    private String functionName;
    private ArrayList<JSTest> tests;

    public  JSToObject(String testName, String js, String functionName, ArrayList<JSTest> tests) {
        this.testName = testName;
        this.js = js;
        this.functionName = functionName;
        this.tests = tests;
    }

    public String getTestName() {
        return testName;
    }

    public String getJS() {
        return js;
    }

    public String getFunctionName() {
        return functionName;
    }

    public ArrayList<JSTest> getTests() {
        return tests;
    }
}
