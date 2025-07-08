package ThreadsProblems.NumberOfWaysToCreateThread;

public class ByAnonymous_Runnable {
    public static void main(String[] args) {
        Thread th=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous Runnable Thread");
            }
        });
        th.start();
    }
}
