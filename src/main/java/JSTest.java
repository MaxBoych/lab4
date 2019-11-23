import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSTest {

    @JsonProperty(Config.PACKAGE_ID)
    private String testName;
    private String expectedResult;
    private Object[] params;

    public JSTest(String testName, String js, Object[] params) {
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

    public Object[] getParams() {
        return params;
    }
}
