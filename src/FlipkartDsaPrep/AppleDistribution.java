package FlipkartDsaPrep;

import java.util.Arrays;

public class AppleDistribution {
    public static int minimumBox(int[] apples, int[] boxes){
        int appleSum=0;
        for (int num:apples){
            appleSum+=num;
        }
        int count=0;
        Arrays.sort(boxes);
        for (int i = boxes.length-1; i >=0 ; i--) {
            appleSum-=boxes[i];
            count++;
            if (appleSum<=0){
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] apples={1,3,2};
//        int[] boxes={4,3,1,5,2};
//        System.out.println(minimumBox(apples,boxes)); //2
        int[] apples={5,5,5};
        int[] boxes={2,4,2,7};
        System.out.println(minimumBox(apples,boxes));//4
    }
}
