package T2021;

class BaseClass{
    String baseS="缺省1";
    BaseClass(String s){
        baseS = s;
        System.out.println("基类构造方法被调用");
    }
    public void m(){
        g();h();
        System.out.println("mmmmmm");//你的解答m的个数不需要精确
    }
    public void g(){
        System.out.println("基类方法g()被调用"+baseS);
    }
    private void h(){
        System.out.println("基类方法h()被调用");
    }
}
class ChildClass extends BaseClass{
    String childS="缺省2";
    ChildClass(String s1,String s2){
        super(s1);
        childS = s2;
        System.out.println("子类构造方法被调用："
                +"ChildClass(String,String)");
    }
    ChildClass(){
        this("666","888");
        System.out.println("子类构造方法被调用：ChildClass()");
    }
    public void g(){
        System.out.println("子类方法g()被调用" + childS);
    }
    private void h(){
        System.out.println("子类方法h()被调用");
    }
}
public class E24A {
    public static void main(String[] args){
        BaseClass[] blist={new BaseClass("1024"),
                new ChildClass(),new ChildClass("Java","2021")};
        System.out.println("******");//你的解答*个数不需要精确
        blist[0].m();blist[1].m();
    }
}
