package Design_Pattern.Singleton;

public class ThreadSafeBrowser {
    private volatile static ThreadSafeBrowser threadSafeBrowser;
    private ThreadSafeBrowser(){};
    public static ThreadSafeBrowser getInstance(){
        if (threadSafeBrowser==null){
            synchronized (ThreadSafeBrowser.class){
                if (threadSafeBrowser==null){
                    threadSafeBrowser=new ThreadSafeBrowser();
                }
            }
        }
        return threadSafeBrowser;
    }
    public void displayMessage(){
        System.out.println("Thread safe browser");
    }
}
