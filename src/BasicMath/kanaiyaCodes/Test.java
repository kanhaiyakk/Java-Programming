package BasicMath.kanaiyaCodes;

class OverloadindConcept {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

}
public class Test{
    public static void main(String[] args) {
        OverloadindConcept obj=new OverloadindConcept();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
    }
}
