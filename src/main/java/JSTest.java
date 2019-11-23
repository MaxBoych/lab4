import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSTest {

    @JsonProperty(Config.TEST_NAME)
    private String testName;

    @JsonProperty(Config.EXPECTED_RESULT)
    private String expectedResult;

    @JsonProperty(Config.PARAMS)
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
