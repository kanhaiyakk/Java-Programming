package BasicMath.kanaiyaCodes;

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Kanhaiya kumar";
        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println(reversedString);
    }
}
