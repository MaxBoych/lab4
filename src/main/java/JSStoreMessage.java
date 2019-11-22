import java.util.ArrayList;

public class JSStoreMessage {

    private String testName;
    private String js;
    private ArrayList<Object> params;
    private String result;

    public JSStoreMessage(String testName, String js, ArrayList<Object> params, String result) {
        this.testName = testName;
        this.js = js;
        this.params = params;
        this.result = result;
    }

    public String getTestName() {
        return testName;
    }

    public String getJS() {
        return js;
    }

    public ArrayList<Object> getParams() {
        return params;
    }

    public String getResult() {
        return result;
    }
}

