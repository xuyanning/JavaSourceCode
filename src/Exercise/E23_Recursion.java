package Exercise;

public class E23_Recursion {
    public static void main(String[] args) {
        h(3, 'a', 'b', 'c', 3);
    }

    public static void m(int step, char s, char d) {
        System.out.println("disk " + step + " from " + s + " to " + d);
    }
//汉诺塔
    public static void h(int n, char s, char t, char d, int diskN) {
        if (n == 1) m(diskN, s, d);
        else {
            h(n - 1, s, d, t, diskN - 1);
            m(diskN, s, d);
            h(n - 1, t, s, d, diskN - 1);
        }
    }
}

//背包问题
class RecursiveSack {
    public static void main(String[] args) {

        int[] arr = {11,8,7,4,3};
        System.out.println(knapsack(arr, 0, 29, 29));

    }
    public static boolean knapsack(int[] arr, int start, int left, int sum) {
        if (arr.length == 0)
            return false;
        if (start == arr.length) {
            int[] tempArr = new int[arr.length - 1];
            for (int i = 0; i < tempArr.length; i++)
                tempArr[i] = arr[i + 1];
            return knapsack(tempArr, 0, sum, sum);
        }
        else if (arr[start] > left)
            return knapsack(arr, start + 1, left, sum);
        else if (arr[start] == left) {
            for (int i = 0; i < start + 1; i++)
                System.out.print(arr[i] + "\t");
            return true;
        } else
            return knapsack(arr, start + 1, left - arr[start], sum);
    }
}

//标准全排列以及组合优化问题
class Permutation {
    static int arrange(int[] price, int aim) {
        if (price == null || price.length == 0 || aim < 0) return 0;
        int[] num = new int[price.length];
        return process(price, num, 0, aim);
    }

    static int process(int[] price, int[] num, int index, int aim) {
        int res = 0;
        if (index == price.length) {
            if (aim == 0) {
                res = 1;
                for (int n : num) {
                    System.out.print(n + "\t");
                }
                System.out.println();
            }
        } else
            for (int i = 0; price[index] * i <= aim; i++) {
                num[index] = i;
                res += process(price, num, index + 1, aim - price[index] * i);
            }

        return res;
    }

    public static void main(String[] args) {
     //   int list[] = {3, 2, 1};
      //  System.out.println(arrange(list, 10));
        int pList[] = {1,0,2,4};
        permutation(pList,0,2);
        System.out.println("****");
        permutation(pList, 1, 4);
    }

    public static void permutation(int[] list, int start, int end) {
        if (start == end) {
            for (int i :list)
                System.out.print(i );
            System.out.println();
        } else {
            for (int i = start; i < end; i++) {
                swap(list, start, i);
                permutation(list, start + 1, end);
                swap(list, start, i);
            }
        }
    }
    public static void swap(int[] list, int i, int j) {
        int temp;
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

}

//全排列变形
class Permutation2 {
    private static int[] a= {1,2,3,4};
    private static int[] b = new int[3];
    public static void main(String[] args){
        C(3,4);
    }
    public static void C(int m,int n){
        int i,j;
        for(i=m;i<=n;i++) {
            b[m-1] = i-1;
            if(m>1)
                C(m-1,i-1);
            else {
                for(j=0;j<3;j++)
                    System.out.print(a[b[j]] + "  ");
                System.out.println();
            }
        }
    }
}


class InfiniteRecursion {
    static int count=0;
    public static void main(String[] args){
        try {
            m();
        }catch (Exception e){
            System.out.println("异常处理");
        }
    }
    public static void m(){
        System.out.println(count++);
        m();
    }
}

class InfiniteRecursion2 {
    public static void main(String[] a){
        m(0);
    }
    static void m(int j){
        double x,y,z,a,b,c,d;
        System.out.println(j);
        x=y=z=a=b=c=d=0;
        m(j+1);

    }
}