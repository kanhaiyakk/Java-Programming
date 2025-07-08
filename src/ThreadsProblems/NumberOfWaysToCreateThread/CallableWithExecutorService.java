package ThreadsProblems.NumberOfWaysToCreateThread;

import java.util.concurrent.*;

public class CallableWithExecutorService {
    public static void main(String[] args) throws Exception{
        // Create a single-threaded ExecutorService
        ExecutorService service= Executors.newSingleThreadExecutor();
        // Submit a Callable task
        Future<String> future=service.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Thread is running.....";
            }
        });
        // Retrieve the result from Future
        String result=future.get(); // blocks until task completes
        System.out.println(result);
        service.shutdown(); // Shutdown the ExecutorService
    }
}
