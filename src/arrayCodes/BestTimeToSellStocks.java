package arrayCodes;

public class BestTimeToSellStocks {
    public static int bestTime(int arr[]){
        int mini=arr[0];
        int maxProfit=0;
        for (int num:arr){
            int cost=num-mini;
            maxProfit=Math.max(maxProfit,cost);
            mini=Math.min(mini,num);
        }
        return maxProfit;


//        int minVal=Integer.MAX_VALUE;
//        int maxProfit=0;
//        for(int num: arr){
//            if (num<minVal){
//                minVal=num;
//            }
//            int currProfit= num-minVal;
//            if (currProfit>maxProfit){
//                maxProfit=currProfit;
//            }
//        }
//        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(bestTime(arr));
    }
}
