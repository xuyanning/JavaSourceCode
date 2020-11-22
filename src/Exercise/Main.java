package Exercise;

public class Main {

    public static void main(String[] args) {
        int x = 5;
        m(x,3);
        System.out.println(x);
    }
    static void m(int ...a){
        a[0]= 2;
    }
}
