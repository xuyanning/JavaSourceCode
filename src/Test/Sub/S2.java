package Test.Sub;

import Test.F;
import Test.F5;

public class S2 extends F {
    int x5;
    public String toString(){

        return ""+ x1+x2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class S3 extends F{
    protected int x2 = 7;
    int x3 = 6;
    private int x4 = 5;
    public String toString(){
        return ""+ super.x2+ x3 + x4 + x2;
    }
}

abstract class S5 extends F5 {
    protected void m1(){}
    private void m2(){}
    protected S5 m3(){return null;}
    //public int m4(){return 0;}
    public void m4(){}
    public static void m5(){}
    public void m6(int i){}
    public void m7(){}
}

class F6{
    F6 m1(){return null;};
}
class S6 extends F6{
    S6 m1(){return null;}
}
class M{
    static void m(){
        F6 f = new S6();
        F6 ff = f.m1();
    }
}