package PhonePay_Prep;

public class NumberOfSubstring {
    public static int numberOfSubstring(String str){
        int count=0;
        int n=str.length();
        int[] lastSeen={-1,-1,-1};
        for (int i = 0; i < n; i++) {
            lastSeen[str.charAt(i)-'a']=i;
            if (lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                count=count+ (1+ Math.min(lastSeen[0], Math.min(lastSeen[1],lastSeen[2]) ));
            }
        }
        return count;



        //brute force
//        for (int i = 0; i <n ; i++) {
//            int[] freq=new int[3];
//            for (int j = i; j < n; j++) {
//                freq[str.charAt(j)-'a']=1;
//                if(freq[0]+freq[1]+freq[2]==3){
//                    count++;
//                }
//            }
//        }
//        return count;
    }
    public static void main(String[] args) {
        String str="abcabc";
        System.out.println(numberOfSubstring(str));
    }
}
