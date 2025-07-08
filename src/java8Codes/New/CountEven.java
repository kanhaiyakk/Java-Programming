package java8Codes.New;

import java.util.Arrays;
import java.util.List;

public class CountEven {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(5,8,9,17,15,12,3,4);
        long evenCount=integerList.stream()
                .filter(i->i%2==0)
                .count();
        System.out.println(evenCount);
        //Odd count
        long oddCount=integerList.stream()
                .filter(i->i%2!=0)
                .count();
        System.out.println(oddCount);

    }
}
