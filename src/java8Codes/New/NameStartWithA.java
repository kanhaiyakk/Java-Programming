package java8Codes.New;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartWithA {
    public static void main(String[] args) {
        List<String > list= Arrays.asList("Sunny", "Kanhaiya","Shashi","Raja","Aman");
        List<String > names=list.stream()
                .filter(i->i.startsWith("S"))
                //.collect(Collectors.toList());
                        .toList();
        System.out.println(names);
    }
}
