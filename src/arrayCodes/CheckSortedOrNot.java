package arrayCodes;

public class CheckSortedOrNot {
    public static boolean sortedOrNot(int[] arr){
        //Optimal solution
        int n= arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;

        //brute force
       // int n= arr.length;
//        for (int i = 0; i <n ; i++) {
//            for (int j = i+1; j < n; j++) {
//                if (arr[j]<arr[i]){
//                    return false;
//                }
//            }
//        }
//        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,5,7};
        System.out.println(sortedOrNot(arr));
    }
}
