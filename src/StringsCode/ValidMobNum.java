package StringsCode;

public class ValidMobNum {
    public static void main(String[] args) {
        String[] s={"6987875214", "9632145545"};
        String r="^[7-9][0-9]{9}$";
        for (String number: s) {
            if (number.matches(r)) {
                System.out.println(number + " : is valid num");
            } else {
                System.out.println(number + " : is not valid num");
            }
        }
    }
}
