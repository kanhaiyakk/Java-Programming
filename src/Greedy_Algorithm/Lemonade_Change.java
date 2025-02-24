package Greedy_Algorithm;

public class Lemonade_Change {
    public static boolean lemonadeChange(int[] bills){
        int five=0,ten=0;
        for (int num:bills){
            if (num==5){
                five=five+1;
            } else if (num==10) {
                if (five>=1){
                    five=five-1;
                    ten=ten+1;
                }else {
                    return false;
                }
            }else {
                if (ten>=1 && five>=1){
                    ten=ten-1;
                    five=five-1;
                } else if (five>=3) {
                    five=five-3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={5,5,10,10,20};
        System.out.println(lemonadeChange(arr));
    }
}
