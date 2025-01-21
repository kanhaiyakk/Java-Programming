package arrayCodes;

import java.util.ArrayList;
import java.util.List;

public class PascleTrianglr2 {
    public static List<Integer> generate1(int rowIndex){
        List<Integer> row=new ArrayList<>();
        long value=1;
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) value);
            value=value*(rowIndex-i)/(i+1);
        }
        return row;
    }

    public static void main(String[] args) {
        int rowIndex=4;
        List<Integer> kk=generate1(rowIndex);
        System.out.println(kk);
    }
}
