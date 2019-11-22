import java.util.ArrayList;

public class JSStoreMessage {

    private String packageId;
    private String jsScript;
    private ArrayList<Integer> params;
    private String result;

    public JSStoreMessage(String testName, String js, ArrayList<Integer> params, String result) {
        this.packageId = testName;
        this.jsScript = js;
        this.params = params;
        this.result = result;
    }

    public String getPackageId() {
        return packageId;
    }

    public String getJsScript() {
        return jsScript;
    }

    public ArrayList<Integer> getParams() {
        return params;
    }

    public String getResult() {
        return result;
    }
}

