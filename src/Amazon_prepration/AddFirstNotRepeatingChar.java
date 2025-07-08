package Amazon_prepration;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

//Problem: First Non-Repeating Character in a Stream
//Given:
//A string s consisting of lowercase English letters.
//Task:
//For each character processed from left to right, output the first non-repeating character in the stream so far.
//If no such character exists at any point, output '#'.
//Input: "abcabc"
//Output: "aaabc#"
public class AddFirstNotRepeatingChar {
    public static String firstNonRepeatingChar(String str){
        StringBuilder result=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        Queue<Character> queue=new LinkedList<>();
        for (char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            queue.offer(ch);
            while (!queue.isEmpty() && map.get(queue.peek())>1){
                queue.poll();
            }
            if (queue.isEmpty()){
                result.append('#');
            }else{
                result.append(queue.peek());
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str="abcabc";
        System.out.println(firstNonRepeatingChar(str));
    }
}
