package arrayCodes;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> row,preRow=null;
        for (int i = 0; i < numRows; i++) {
            row=new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0 || j==i){
                    row.add(1);
                }
                else {
                    row.add(preRow.get(j-1)+preRow.get(j));
                }

            }
            preRow=row;
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        int numRow=5;
        List<List<Integer>> kk=generate(numRow);
        System.out.println(kk);
    }
}
