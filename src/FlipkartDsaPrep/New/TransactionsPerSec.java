package FlipkartDsaPrep.New;

public class TransactionsPerSec {
    public static long estimatedStorage(int transactionsPerSec, int months, int bytesPerTransaction){
        int secondsPerDay=86400;
        int days=months*30;
        long totalTransaction=(long) transactionsPerSec * secondsPerDay * days;
        return (long) totalTransaction * bytesPerTransaction;
    }

    public static void main(String[] args) {
        long storageByte=estimatedStorage(10,6,128);
        double storageGB=(double) storageByte/(1024*1024*1024);
        System.out.println(storageGB);
    }
}
