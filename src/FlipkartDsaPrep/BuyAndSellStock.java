package FlipkartDsaPrep;

public class BuyAndSellStock {
    public static int bestTime(int[] arr){

        int minVal=arr[0];
        int maxProfit=0;
        for (int num:arr){
            minVal=Math.min(minVal,num);
            int profit=num-minVal;
            maxProfit=Math.max(maxProfit,profit);

        }
        return maxProfit;
        //method-2
//        int minValue=Integer.MAX_VALUE;
//        int maxProfit=0;
//        for (int currValue:arr) {
//            if (currValue < minValue) {
//                minValue = currValue;
//            }
//
//            int currProfit =currValue-minValue;
//            maxProfit=Math.max(maxProfit,currProfit);
//        }
//        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(bestTime(arr));
    }
}
