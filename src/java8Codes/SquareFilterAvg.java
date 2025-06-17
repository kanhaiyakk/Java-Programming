package java8Codes;

import java.util.Arrays;
import java.util.List;
// Square, Filter and Average of Numbers
public class SquareFilterAvg {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,10,20,30,15);
        double avg=list.stream()
                            .map(e->e*e) //square
                            .filter(e-> e>100) //filter element
                            .mapToInt(e->e) //map each element to int
                            .average().getAsDouble(); //average
        System.out.println(avg);
    }
}
