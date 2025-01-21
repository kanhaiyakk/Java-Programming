package arrayCodes;

public class DoubleOfNum {
    public static boolean doubleOfNumArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i !=j && arr[i]==arr[j]*2){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={10,2,5,3};
        int[] arr1={1,3,4,9};

        boolean result=doubleOfNumArray(arr1);
        System.out.println(result);
    }
}
