import java.util.ArrayList;

public class JSTest {

    private String testName;
    private String expected;
    private ArrayList<Object> params;

    public JSTest(String testName, String expected, ArrayList<Object> params) {
        this.testName = testName;
        this.expected = expected;
        this.params = params;
    }

    public String getTestName() {
        return testName;
    }

    public String getExpected() {
        return expected;
    }

    public ArrayList<Object> getParams() {
        return params;
    }
}
