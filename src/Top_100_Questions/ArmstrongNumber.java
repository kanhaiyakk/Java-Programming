package Top_100_Questions;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num){
        int pow=0;
        int sum=0;
        int temp=num;
        while (temp>0){
            int digit=temp%10;
            pow++;
            temp=temp/10;
        }
        temp=num;
        while (temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,pow);
            temp=temp/10;
        }
        if (num==sum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num=9474;
        System.out.println(isArmstrong(num));
    }
}
