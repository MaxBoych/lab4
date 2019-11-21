import java.util.ArrayList;

public class JSToObject {

    private String id;
    private String js;
    private ArrayList<JSTests> tests;

    public  JSToObject(String id, String js, ArrayList<JSTests> tests) {
        this.id = id;
        this.js = js;
        this.tests = tests;
    }

    public String getID() {
        return id;
    }

    public String getJS() {
        return js;
    }

    public ArrayList<JSTests> getTests() {
        return tests;
    }
}
