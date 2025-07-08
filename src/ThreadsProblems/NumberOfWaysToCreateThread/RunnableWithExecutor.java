package ThreadsProblems.NumberOfWaysToCreateThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableWithExecutor {
    public static void main(String[] args) {
        ExecutorService service= Executors.newSingleThreadExecutor();
        service.execute(()->
                System.out.println("Thread is running......"));
        service.shutdown();
    }
}
