package arrayCodes;

public class ThirdLargest {
    int thirdLargest(int arr[]) {
        // Your code here
        if(arr == null ||arr.length<3) return -1;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }else if(num>max2 && num<max1){
                max3=max2;
                max2=num;
            }
            else if(num>max3 && num<max2){
                max3=num;
            }
        }
        return max3;
    }
}
