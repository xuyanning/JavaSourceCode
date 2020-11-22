package Exercise;

public class SortTest {
    public static void main(String[] args){
        int[][] a = {{1,3,2},{3,2,1}};
        m1(a[0],a[1][0],a[1][1],a[1][2]);
        for (int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }
    static void m1(int[] a,int ...b){
        m2(a);
        m2(b);
    }
    static void m2(int[] a){
        for (int i =0; i< a.length-1;i++){
            if (a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        System.out.println(a[0]+"\t" + a[a.length-1]);
    }
}
