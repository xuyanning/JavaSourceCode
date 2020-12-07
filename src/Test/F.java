package Test;

public class F {
    public int x1 = 1;
    protected int x2 = 2;
    int x3 = 3;
    private int x4 = 4;
    public F(){
        x1 = x2 = x3  = 5;
    }
    public String toString(){
        return ""+x1+x2+x3+x4;
    }
}
class F4{
    private int ii = 5;
    F4(){    }
    void m(){}
}
class S4 extends F4{
    int ii = 6;
    S4(){ this(0);}
    S4(int i){ this.ii = i;}
  //  void m(){this.ii = super.ii;}
}


