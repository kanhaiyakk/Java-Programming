package FlipkartDsaPrep;

public class BuyAndSellStock2 {
    public static int bestTimeToBuyAndSell(int[] prices){
        int maxProfit=0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i+1]>prices[i]){
                maxProfit += prices[i+1]-prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};

        System.out.println(bestTimeToBuyAndSell(prices));
    }
}
