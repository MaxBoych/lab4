import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class JSExecute {

    @JsonProperty(Config.TEST_NAME)
    private String testName;

    @JsonProperty(Config.EXPECTED_RESULT)
    private String expectedResult;

    @JsonProperty(Config.PARAMS)
    private Object[] params;

    @JsonProperty(Config.RESULT)
    private String result;

    @JsonProperty(Config.IS_EXPECTED)
    private boolean isExpected;

    public JSExecute(String testName, String expectedResult, Object[] params,
                     String result, boolean isExpected) {
        this.testName = testName;
        this.expectedResult = expectedResult;
        this.params = params;
        this.result = result;
        this.isExpected = isExpected;
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

    public String getResult() {
        return result;
    }

    public boolean isExpected() {
        return isExpected;
    }
}
