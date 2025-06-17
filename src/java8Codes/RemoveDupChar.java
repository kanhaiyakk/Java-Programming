package java8Codes;

public class RemoveDupChar {
    public static void main(String[] args) {
        String str="programming";
        StringBuilder sb=new StringBuilder();
        str.chars()
                .distinct()
                .forEach(c-> sb.append((char) c));
        String res=sb.toString();
        System.out.println(res);
    }
}
