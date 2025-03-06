package PayPal_Prep;

import java.util.HashSet;
import java.util.Set;

public class FrogAndJump {
    public static int frogJump(int N, int leaves, int[] frogs) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int jump = frogs[i];
            if (jump > leaves) continue;
            for (int j = jump; j <= leaves; j += jump) {
                set.add(j);
            }
        }
        return leaves - set.size();
    }

    public static void main(String[] args) {
        int N = 3, leaves = 4;
        int[] frogs = {3, 2, 4};
        System.out.println(frogJump(N,leaves,frogs));
    }
}