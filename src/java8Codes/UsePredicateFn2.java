package java8Codes;

import java.util.function.Predicate;

public class UsePredicateFn2 {
    public static void main(String[] args) {

        Predicate<Integer> isPositive=num -> num>0;
        Predicate<Integer> isOdd=i ->i%2 !=0;

        System.out.println(isPositive.and(isOdd).test(3));
        System.out.println(isPositive.and(isOdd).test(-3));
        System.out.println(isPositive.or(isOdd).test(-3));
        System.out.println(isOdd.negate().test(4));
        System.out.println(isOdd.negate().test(3));

    }
}
