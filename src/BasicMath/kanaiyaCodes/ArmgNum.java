package BasicMath.kanaiyaCodes;

public class ArmgNum {
    public static boolean isArmstrong(int num){
        int temp=num;
        double sum=0;
        int len= String.valueOf(num).length();
        while (temp>0){
            int digit=temp%10;
            sum=sum+ Math.pow(digit,len);
            temp=temp/10;
        }
//        if (sum==num){
//            return true;
//        }
//        return false;
        return sum == num;
    }

    public static void main(String[] args) {
        int num=9474;
        System.out.println(isArmstrong(num));
    }
}
