package BasicMath.kanaiyaCodes;
class MyTest{
    public void myMethod(){
        System.out.println("My method");
    }
}
public class OverridingConcept extends MyTest{
    public void myMethod(){
        System.out.println("Override method");
    }

    public static void main(String[] args) {
        MyTest obj=new OverridingConcept();
        obj.myMethod();
    }
}
