import java.util.HashMap;
import java.util.Map;

public class SingleElement {
    //arr = {1,2,3,4,1,2,3}
    //
    //output - 4
    //
   public static int checkSingleElement(int[] arr) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num:arr){
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
//            if (entry.getValue()==1){
//                return entry.getKey();
//            }
//        }
//        return 0;
    int left=0;
            int right=arr.length-1;
            while (left<right){
                int mid=left+(right-left)/2;
                if (mid%2==1){
                    mid--;
                }
                if (arr[mid]==arr[mid+1]  ){
                    left=mid+2;
                }else{
                    right=mid;
                }
            }
       return arr[left];
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4};
        System.out.println(checkSingleElement(arr));
    }

}
