package T2021;

class FClass{
    public FClass(){
        System.out.println("基类构造方法");
        m1(1);
    }
    public void m1(double d){
        System.out.println("基类m1(double)"+d);
        m2(d);
    }
    public void m2(int i){
        System.out.println("基类m2(int)" + i);
    }
    public void m2(double d){
        System.out.println("基类m2(double)" + d);
    }
}
class SubClass extends FClass {
    public SubClass(int i){
        System.out.println("子类构造方法");
        m1(i);
    }
    public void m1(int i){
        System.out.println("子类m1(int)" + i);
        m2(i);
    }
    public void m2(double d){
        System.out.println("子类m2(double)" + d);
    }

}
public class E24B {
    public static void main(String[] args){
        FClass obj1=new SubClass(1);
        System.out.println("******");
        ((SubClass)obj1).m2(4);
        obj1.m2(2);
        ((SubClass)obj1).m1(3);
        obj1.m1(1);
    }
}
