package Recurtion;

public class FindFirstLastOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(String str,int index,char element){
        if (index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(index);
        if (currChar==element){
            if (first==-1){
                first=index;
            }else {
                last=index;
            }
        }
        findOccurance(str,index+1,element);
    }

    public static void main(String[] args) {
        String str="abcaakrfnnae";
        char element='a';
        int index=0;
        findOccurance(str,index,element);
    }
}
