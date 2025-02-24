package arrayCodes;

public class Test12 {
public static void anagrams(String s1, String s2){
    if(s1.length() !=s2.length()){
        System.out.println("S1 and S2 are not anagrams1255");
        return;
    }
    int[] freq1=new int[256];
    int[] freq2=new int[256];
    for (char ch: s1.toCharArray()){
        freq1[ch]++;
    }
    for(char ch1: s2.toCharArray()){
        freq2[ch1]++;
    }

    for (int i=0; i < 256; i++) {
        if (freq1[i]!=freq2[i]){
            System.out.println("s1 and s2 in not anagrams");
            return;

        }
    }
    System.out.println("anagram");
}

public static void main(String[] args) {
    String s1="earth";
    String s2="heark";
    anagrams(s1,s2);
}
}
//public static int largest(int[] arr){
//    int large=-1;
//    int secondLarge=-1;
//    for (int high =0 ; high <arr.length ; high++) {
//        if (arr[high]>large){
//            secondLarge=large;
//            large=arr[high];
//        } else if (arr[high]<large && secondLarge<arr[high]) {
//            secondLarge=arr[high];
//        }
//    }
//    return secondLarge;
//}
//
//    public static void main(String[] args) {
//        int[] arr={12,14,5,9,7,15,15};
//        System.out.println(largest(arr));
//    }
//}
