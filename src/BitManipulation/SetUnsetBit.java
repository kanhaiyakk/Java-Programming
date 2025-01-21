package BitManipulation;
//Given a non-negative number n . The problem is to set
// the rightmost unset bit in the binary representation of n.
public class SetUnsetBit {
    static int setBit(int n) {
        return n | (~n & (n+1));
    }

    public static void main(String[] args) {
        int n=15;
        System.out.println(setBit(n));
    }
}
