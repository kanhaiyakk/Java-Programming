package ThreadsProblems;

public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread th=new Thread(()->
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread "+i);
            }
        });
        th.start();
        th.join();    // main thread waits for t1 to finish

        System.out.println("Main thread continues after t1 finishes");

    }
}
