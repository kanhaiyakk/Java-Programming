package ThreadsProblems;

public class WaitsForThreadsToComplete {
    public static void main(String[] args) throws InterruptedException{
        Thread t1=new Thread(()->
        {
            for (int i = 1; i <=5; i++) {
                System.out.println("Thread1 "+i);
            }
        });

        Thread t2=new Thread(()->
        {
            for (int i = 6; i <=10 ; i++) {
                System.out.println("Thread2 "+i);
            }
        });
//        t1.start();
//        t2.start();
//        //// Wait for both threads to finish
        //it will print in any order like first thread then second thread and mixed also
//        t1.join();
//        t2.join();

        t1.start();
        t1.join();// wait for t1 to finish before starting t2

        t2.start();
        t2.join();

        System.out.println("All processing done. Aggregating results...");
    }
}
