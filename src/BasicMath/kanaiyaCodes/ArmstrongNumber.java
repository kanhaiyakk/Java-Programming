package BasicMath.kanaiyaCodes;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num){
        int sum=0;
        int digits = String.valueOf(num).length();
        int temp=num;
        while (temp>0){
            int lastdigit= temp%10;
            sum += Math.pow(lastdigit, digits);
            temp=temp/10;
        }
        return sum==num;
    }

    public static void main(String[] args) {
        int num=9474;
        System.out.println(num+ " is Armstrong Number "+isArmstrong(num));
    }
}
