package CollectionsCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Flrst3MaxMIn {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(55,85,95,75,13,91,82,72,99,2,3,6,7);
        System.out.println("-----------------");

        System.out.println("Minimum 3 Numbers");

        System.out.println("-----------------");
        integerList.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("-----------------");

        System.out.println("Maximum 3 Numbers");

        System.out.println("-----------------");
        integerList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
