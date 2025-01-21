package java8Codes;

import java.util.Arrays;
import java.util.List;

//Count Filtered Elements:
//How can you count the number of elements in a list that satisfy a given condition, such as being greater than 100?
public class CountFilteredElement {
    public static void main(String[] args) {
        List<Integer> arrList= Arrays.asList(102,111,122222,991,13,187,66,99);
       // long count=arrList.stream().filter(i->i>100).mapToInt(Integer::intValue).count();
        long count=arrList.stream().filter(i->i>100).count();
        System.out.println(count);
    }
}
