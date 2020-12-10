package T2021;

public class T23B {
    static String[] s = {null, "S disk","M disk","L disk"};
    public static void main(String[] args) {
        h(3, 'a', 'b', 'c', 3);
    }

    static void m(int diskN, char src, char dst) {
        if (diskN == s.length-1) System.out.println("****");
        System.out.println(s[diskN] + " from " + src + " to " + dst);
    }
    //汉诺塔
    static void h(int n, char s, char t, char d, int diskN) {
        if (n == 1) m(diskN, s, d);
        else {
            h(n - 1, s, d, t, diskN - 1);
            m(diskN, s, d);
            h(n - 1, t, s, d, diskN - 1);
        }
    }
}
