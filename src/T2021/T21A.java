package T2021;


public class T21A {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = {{1,0},{0,1}};
        for (int i = 0;i<a.length;i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (i == j)? 2:0;
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("***");
        for (int i = 0;i<a.length-1;i++) {
            for (int j = 0; j < a[0].length-1; j++) {
                System.out.print(a[i][j]*b[0][0]+a[i][j+1]*b[0][1]+
                        a[i+1][j]*b[1][0]+a[i+1][j+1]*b[1][1]);
            }
            System.out.println();
        }
    }
}
