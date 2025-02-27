package ThreadsProblems;

public class Print1to10 extends Thread {

    @Override
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName()+ " :"+ i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Print1to10 th=new Print1to10();
        th.setName("NumberThread ");
        th.start();
    }

}
