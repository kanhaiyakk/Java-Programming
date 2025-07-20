package Goldman_Sachs;

public class ContainerWithMostWater {
    public static int mostWater(int[] heights){
        int low=0;
        int high= heights.length-1;
        int maxArea=0;
        while (low<high){
            int area=Math.min(heights[low],heights[high])*(high-low);
            maxArea=Math.max(maxArea,area);
            if(heights[low]<heights[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights={1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(heights));
    }
}
