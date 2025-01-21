package BasicMath.kanaiyaCodes;

public class ReverseStringUsingLoop {
    public static void main(String[] args) {
        String orignalString = "Kanhaiya is good boy";
        String reversedString = "";
//        for (int i = 0; i < orignalString.length(); i++) {
//            reversedString=orignalString.charAt(i)+reversedString;
//        }

        for (int i = orignalString.length()-1; i >= 0; i--) {
            reversedString = reversedString + orignalString.charAt(i);
        }
            System.out.println("Reverse of entered string is: " + reversedString);

    }
}