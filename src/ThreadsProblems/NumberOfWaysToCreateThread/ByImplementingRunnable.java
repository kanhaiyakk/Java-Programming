package ThreadsProblems.NumberOfWaysToCreateThread;

public class ByImplementingRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        ByImplementingRunnable th=new ByImplementingRunnable();
        Thread t=new Thread(th);
        t.start();
    }
}
