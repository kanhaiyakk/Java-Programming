package CollectionsCode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Code {
    public static void main(String[] args) {
        List<Integer> listOfInteget = Arrays.asList(22,23,27,28,29,55,21,77,81,13,8);
        Map<Boolean, List<Integer>> oddEvenNumbersMap = listOfInteget.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
        for (Map.Entry<Boolean, List<Integer>> entry : entrySet)
        {
            System.out.println("---------");
            if (entry.getKey()){
                System.out.println("Even Numbers");
            }
            else {
                System.out.println("Odd Numbers");
            }
            System.out.println("-------");
            List<Integer> list = entry.getValue();
            for (int i : list){
                System.out.println(i);
            }
        }

    }
}
