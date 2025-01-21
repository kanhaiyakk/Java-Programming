package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GraterThan50 {
    public static void main(String[] args) {
        List<Integer> arrList= Arrays.asList(12,15,51,89,78,45,66,34,99);
        int sum=arrList.stream().filter(i -> i>50)
                .mapToInt(Integer::intValue).sum();
        System.out.println(sum);



//        List<Integer> num = arrList.stream().filter(i ->i>50).collect(Collectors.toList());
//        System.out.println("list of numbers grater than 50 : "+num);
//        int sum=0;
//        for(int kk : num){
//            sum +=kk;
//        }
//        System.out.println("list of numbers grater than 50 : "+sum);
    }
}
