package ThreadsProblems.NumberOfWaysToCreateThread;

public class UsingLambda {
    public static void main(String[] args) throws InterruptedException{
        Thread th=new Thread(()->
        {
            for (int i = 1; i <=10 ; i++) {
                System.out.println("Thread "+i);
            }
        });
        th.start();
    }
}
