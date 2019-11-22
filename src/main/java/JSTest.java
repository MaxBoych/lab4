import java.util.ArrayList;

public class JSTest {

    private String testName;
    private String expectedResult;
    private ArrayList<Integer> params;

    public JSTest(String testName, String js, ArrayList<Integer> params) {
        this.testName = testName;
        this.expectedResult = js;
        this.params = params;
    }

    public String getTestName() {
        return testName;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public ArrayList<Integer> getParams() {
        return params;
    }
}
