package arrayCodes;

public class LargestInArray {
    public static int largElement(int[] arr){
        int high=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>high){
                high=arr[i];
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] arr={5,90,6,8,72};
        int result=largElement(arr);
        System.out.println(result);
    }
}
