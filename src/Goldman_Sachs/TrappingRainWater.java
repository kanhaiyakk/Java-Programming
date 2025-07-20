package Goldman_Sachs;

public class TrappingRainWater {
    public static int trappingRainWater(int[] height){
        int n= height.length;
        //optimal
        int total=0,leftMax=0,rightMax=0;
        int left=0,right=n-1;
        while(left<right){
            if(height[left]<=height[right]){
                if(leftMax>height[left]){
                    total+=leftMax-height[left];
                }else{
                    leftMax=height[left];
                }
                left++;
            }else{
                if(rightMax>height[right]){
                    total+=rightMax-height[right];
                }else{
                    rightMax=height[right];
                }
                right--;
            }
        }
        return total;




        //time-O(2N+N), Space- O(2N)
//        int total=0;
//        int leftMax=0,rightMax=0;
//        int[] prefix=new int[n];
//        int[] suffix=new int[n];
//        prefix[0]=height[0];
//        for (int i = 1; i <n ; i++) {
//            prefix[i]=Math.max(prefix[i-1], height[i]);
//        }
//        suffix[n-1]=height[n-1];
//        for (int i = n-2; i >=0 ; i--) {
//            suffix[i]=Math.max(suffix[i+1],height[i] );
//        }
//        for (int i = 0; i < n; i++) {
//            leftMax=prefix[i];
//            rightMax=suffix[i];
//            if (height[i]<leftMax && height[i]<rightMax){
//                total+=Math.min(leftMax,rightMax)-height[i];
//            }
//        }
//        return total;
    }

    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(height));
    }
}
