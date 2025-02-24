package FlipkartDsaPrep;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagram(String[] strs){
        Map<String, ArrayList<String>> map=new HashMap<>();
        for (String word: strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strs));
    }
}
