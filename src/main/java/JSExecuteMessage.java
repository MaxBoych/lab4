public class JSExecuteMessage {

    private String packageId;
    private JSExecute jsStore;

    public JSExecuteMessage(String packageId, JSExecute jsStore) {
        this.packageId = packageId;
        this.jsStore = jsStore;
    }

    public String getPackageId() {
        return packageId;
    }

    public JSExecute getJsStore() {
        return jsStore;
    }
}

