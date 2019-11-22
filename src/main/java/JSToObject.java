import java.util.ArrayList;

public class JSToObject {

    private String id;
    private String js;
    private String functionName;
    private ArrayList<JSTest> tests;

    public  JSToObject(String id, String js, String functionName, ArrayList<JSTest> tests) {
        this.id = id;
        this.js = js;
        this.functionName = functionName;
        this.tests = tests;
    }

    public String getID() {
        return id;
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
