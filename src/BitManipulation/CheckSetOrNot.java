package BitManipulation;
//Given a number n and a bit number k, check if the kth index bit of n is set or not.
// A bit is called set if it is 1. The position of set bit '1' should be indexed
// starting with 0 from the LSB side in the binary representation of the number.
//Note: Index is starting from 0. You just need to return true or false.
public class CheckSetOrNot {
    static boolean checkKthBit(int n, int k) {
        if((n & (1<<k))!=0){
            return true;
        }else{
            return false;
        }

        //return (n&(1<<k))!=0;
        // return ((n>>k)&1)!=0;
    }

    public static void main(String[] args) {
        int n=9;
        int k=2;
        System.out.println(checkKthBit(n,k));
    }
}
