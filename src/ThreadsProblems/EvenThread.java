package ThreadsProblems;

public class EvenThread extends Thread{
@Override
    public void run(){
    for (int i = 1; i <=10 ; i++) {
        if (i%2==0) {
            System.out.println("Even :" + i);
        }
    }
}

    public static void main(String[] args) {
        EvenThread th=new EvenThread();
        th.start();
    }
}

