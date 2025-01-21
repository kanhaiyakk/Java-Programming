package BasicMath.kanaiyaCodes;

public class AddDigits {
    public static int add(int num){

        int sum=0;

        while (num>0){

            sum+=num%10;
            num/=10;

        }
        if(sum>=10){
           return add(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(add(num));
    }
}
