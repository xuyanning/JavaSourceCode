package T2021;

public class T23A {
    public static void main(String[] args) {
        int pList[] = {1,0,2,4};
        permutation(pList,0,2);
        System.out.println("****");
        permutation(pList, 2, 4);
    }
    static void permutation(int[] list, int start, int end) {
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
    static void swap(int[] list, int i, int j) {
        int temp;
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
