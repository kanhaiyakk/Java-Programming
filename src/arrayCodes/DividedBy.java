package arrayCodes;
// Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
//Sample Output:
public class DividedBy {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i%3==0 || i%5==0 || i%3==0 && i%5 ==0 ){
                System.out.println(i);
            }
        }
    }
}
