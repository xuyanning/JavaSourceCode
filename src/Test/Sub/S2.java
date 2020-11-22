package Test.Sub;

import Test.F;

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
class S3 {
    void m(){
        S2 s2 = new S2();

    }
}