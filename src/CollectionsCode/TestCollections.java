package CollectionsCode;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(2);

//        System.out.println(num.get(2));
//        System.out.println(num.indexOf(6));
//        System.out.println(num.add(9));
//        System.out.println(num);
//        System.out.println(num);
//        i want to print in next line


        for (Object n : num)
        {
            int kk = (Integer)n;
            System.out.println(kk);
        }

    }
}
