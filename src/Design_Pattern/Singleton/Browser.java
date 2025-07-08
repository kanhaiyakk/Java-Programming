package Design_Pattern.Singleton;

public class Browser {
    private static Browser browser;
    private Browser() {};
    public static Browser getInstance(){
        if (browser==null){
            browser=new Browser();
        }
        return browser;
    }
    public void displayMessage(){
        System.out.println("Browser info");
    }
}
