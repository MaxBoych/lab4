import java.util.ArrayList;

public class JSStoreMessage {

    private String testName;
    private String js;
    private ArrayList<Object> params;

    public JSStoreMessage(String testName, String js, ArrayList<Object> params) {
        this.testName = testName;
        this.js = js;
        this.params = params;
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
}

