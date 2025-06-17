package java8Codes;

import java.util.Arrays;
import java.util.List;

public class AnyOfListDividBy2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,12,21,14,18,16);

        boolean anyMatch=list.stream()
                .anyMatch(item->item%2==0);
        System.out.println("Any element divisible by 2:" + anyMatch);

        boolean allMatch=list.stream()
                .allMatch(item->item%2==0);
        System.out.println("All element divisible by 2:"+ allMatch);

        boolean noneMatch=list.stream()
                .noneMatch(item->item%2==0);
        System.out.println("None element divisible by 2:"+ noneMatch);
    }
}
