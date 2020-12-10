package T2021;

public class T21B {
    public static void main(String[] args){
        int[] a = {1024,520,502};
        printList(a);
        printList(m(a,a[0],a[1]));
        printList(a);

    }
    public static void printList(int[] a){
        for (int i:a) System.out.print(i + " ");
        System.out.print("\n");
    }
    public static int f(int x){
        int y = 0;
        while (x != 0){
            int l = x % 100;
            y = y * 100 + l;
            x = x / 100;
        }
        return y;
    }
    public static int[] m(int[] a,int ...b){
        for (int i = 0;i<a.length && i<b.length;i++){
            a[i]=f(a[i]);
            b[i]=f(b[i]);
        }
        return b;
    }
}
