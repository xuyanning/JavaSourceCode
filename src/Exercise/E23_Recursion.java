package Exercise;

public class E23_Recursion {
    public static void main(String[] args) {
        h(3, 'a', 'b', 'c', 3);
    }

    public static void m(int step, char s, char d) {
        System.out.println("disk " + step + " from " + s + " to " + d);
    }

    public static void h(int n, char s, char t, char d, int diskN) {
        if (n == 1) m(diskN, s, d);
        else {
            h(n - 1, s, d, t, diskN - 1);
            m(diskN, s, d);
            h(n - 1, t, s, d, diskN - 1);
        }
    }

}

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
        int list[] = {3, 2, 1};
        System.out.println(arrange(list, 10));
       // int pList[] = {1,8,9,6,2};
       // permulation(pList, 1, 4);
    }

    public static void permulation(int[] list, int start, int end) {
        int i;
        if (start == end) {
            for (i = 0; i < list.length; i++)
                System.out.print(list[i] + " ");
            System.out.println();
        } else {
            for (i = start; i < end; i++) {
                swap(list, start, i);
                permulation(list, start + 1, end);
                swap(list, start, i);
            }
        }
    }

    public static void swap(int[] list, int start, int i) {
        int temp;
        temp = list[start];
        list[start] = list[i];
        list[i] = temp;
    }


}
