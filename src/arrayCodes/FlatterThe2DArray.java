package arrayCodes;

import java.util.ArrayList;
import java.util.List;

public class FlatterThe2DArray {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
//        int row= sc.nextInt();
//        int column= sc.nextInt();

        int[][] flatArrays= {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> flatterList=new ArrayList<>();
        for (int[] row : flatArrays){
            for (int value : row){
                  flatterList.add(value);
            }
        }
        System.out.println(flatterList);


    }
}
