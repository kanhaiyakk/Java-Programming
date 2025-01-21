package CollectionsCode;

import java.util.Arrays;
import java.util.stream.IntStream;

//merge two unsorted arrays into single sorted array using Java 8 streams
public class ConcatArrays {
    public static void main(String[] args) {
        int[] a = new int[] {10,12,8,9,16,9};
        int[] b = new int[] {15,13,7,9,17,8};
        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        //Without duplicates
        //int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));

    }
}
