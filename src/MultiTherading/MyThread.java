package MultiTherading;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("running");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread th=new MyThread();
        th.start();
        th.join();
    }
}
