package StringsCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByFirstChar {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "avocado", "blueberry"};
        Map<Character, List<String>> map=new HashMap<>();
        for (String word:words){
            char firstChar=word.charAt(0);
            if (!map.containsKey(firstChar)){
                map.put(firstChar,new ArrayList<>());
            }
            map.get(firstChar).add(word);
        }
        System.out.println(map);
    }
}
