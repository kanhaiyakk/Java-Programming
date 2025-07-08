package ThreadsProblems.NumberOfWaysToCreateThread;

public class ByExtendingThread extends Thread{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        ByExtendingThread th=new ByExtendingThread();
        th.start();
    }
}
