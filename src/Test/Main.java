package Test;

public class Main {
    public static void main(String[] args){
        F f = new F();
        Dalao[] dl = new Dalao[3];
        dl[0] = new NZDalao();
        dl[1] = new Professor();
        dl[2] = new Boss();
        Student s = (Student) dl[0];
        NZDalao ss = (NZDalao) dl[0];
        s = ss;
    }
}

interface Beauty{
    void goodAtPS();
}
interface Dalao{
    void goodAtSth();
}
abstract class Student{
    abstract void study();
}

class NZDalao extends Student implements Beauty,Dalao{
    void study(){ System.out.println("期待考试");};
    public void goodAtPS(){
        System.out.println("美颜使人自信");
    }
    public void goodAtSth(){
        System.out.println("齐头并进选2B");
    }
}

class Professor implements Dalao{
    public void goodAtSth(){
        System.out.println("忽悠");
    }
}
class Boss implements Dalao{
    public void goodAtSth(){
        System.out.println("我会回来的");
    }
}