package BitManipulation;

public class CountSets {
    public static int countSets(int n){
        int count=0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;

//        while (n>1){
//            count+=n&1;
//            n=n>>1;
//        }
//        if (n==1){
//            count+=1;
//        }
        //return count;



//        while (n>1){
//            if (n%2==1){
//                count+=1;
//            }
//            n=n/2;
//        }
//        if (n==1){
//            count+=1;
//        }
 //       return count;
    }

    public static void main(String[] args) {
        int n=8;
        System.out.println(countSets(n));
    }
}
