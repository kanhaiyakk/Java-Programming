import java.util.Arrays;

public class MoveEvenToLeft {
    public static int[] moveEvenNumToLeft(int[] arr){
        int n= arr.length;
        int left=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]= temp;
                left++;

            }
        }
        Arrays.sort(arr,0,left);
        Arrays.sort(arr,left,n);
        return arr;

//        Arrays.sort(arr);
//        int[] even=new int[n];
//        int[] odd=new int[n];
//        int evenLength=0,oddLength=0;
//        for (int num:arr){
//            if (num%2==0){
//                even[evenLength++]=num;
//            }else{
//                odd[oddLength++]=num;
//            }
//        }
////        Arrays.sort(even,0,evenLength);
////        Arrays.sort(odd,0,oddLength);
//        for (int i=0;i<evenLength;i++){
//            arr[i]=even[i];
//        }
//        for (int i = 0; i < oddLength; i++) {
//            arr[evenLength+i]=odd[i];
//        }
//        return arr;
    }

    public static void main(String[] args) {
        int[] arr={2,8,9,7,17,5,6,13,12,15};
        int[] res=moveEvenNumToLeft(arr);
        System.out.println(Arrays.toString(res));
    }
}
