package ThreadsProblems;

public class OddThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            if (i%2 !=0){
                System.out.println("Odd :"+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        OddThread th=new OddThread();
        th.start();
    }
}
