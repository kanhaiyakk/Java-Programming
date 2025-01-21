package CollectionsCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12,15,78,96,44,33,11,2,55,8,4,7);
        int max = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max num in the list is = "+ max);
        int min = integerList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min num in the list is = "+ min);

    }
}
