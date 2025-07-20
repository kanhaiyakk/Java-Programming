package java8Codes.New;

import java.util.Arrays;
import java.util.List;

public class NumberOfEmployeeGraterSalary {
    public static void main(String[] args) {
        List<Integer> salary= Arrays.asList(40000,55000,66000,35000,90000,49000,25000);
        long ans=salary.stream()
                .filter(sal -> sal>50000)
                .count();
        System.out.println(ans);
    }
}
