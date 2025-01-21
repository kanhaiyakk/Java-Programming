package StringsCode;

public class InsertChar {
    public static String insertChar(StringBuilder sb, char ch, int pos){
        sb.insert(pos, ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kanhaiya");

        String result=insertChar(sb, 'K', 4);
        System.out.println(result);
    }
}
