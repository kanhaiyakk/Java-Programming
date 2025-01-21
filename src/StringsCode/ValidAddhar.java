package StringsCode;

public class ValidAddhar {
    public static String isValid(String input){

        String reg="^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
        if (input.matches(reg)){
            return input+ " : is valid addhar";
        }else{
           return input+ ": is not  valid addhar";
        }
    }

    public static void main(String[] args) {
        String input = "2422 5530 0627";
        String result=isValid(input);
        System.out.println(result);
    }
}
