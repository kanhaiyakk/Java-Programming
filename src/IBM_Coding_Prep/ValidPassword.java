package IBM_Coding_Prep;

public class ValidPassword {
    public static boolean isValid(String str){
        if (str.length()<8 || str.length()>15){
            return false;
        }
        String validNum=".*[0-9].*";
        String lowerCase=".*[a-z].*";
        String upperCase=".*[A-Z].*";
        String specialChar=".*[@!#$%&*].*";

        if (!str.matches(validNum)) return false;
        if (!str.matches(lowerCase)) return false;
        if (!str.matches(upperCase)) return false;
        if (!str.matches(specialChar)) return false;

        return true;
    }

    public static void main(String[] args) {
        String str="Kanh@1234";
        System.out.println(isValid(str)); //true

        String str1="dhdd0123";
        System.out.println(isValid(str1));//false
    }
}
