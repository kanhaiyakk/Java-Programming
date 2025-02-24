package FlipkartDsaPrep;

public class ClosestToZero {
    public static int closeToZero(int[] arr){
        int closest=Integer.MAX_VALUE;
        for (int num:arr){
            if (Math.abs(num)<Math.abs(closest) || (Math.abs(num)==Math.abs(closest) && num>closest)){
                closest=num;
            }

        }
        return closest;
    }

    public static void main(String[] args) {
        int[] arr={-3,5,2,-1,2,3};
        System.out.println(closeToZero(arr));
    }
}
