package Exercise;

public class E26_PrintShape {
    public static void main(String[] args){
        String s = "天行健";
        int n = s.length()-1;
        int diff;
        for (int i = -n; i<=n ;i++ )   {
            for (int j = -n; j<= n; j++){
                diff = Math.abs(i) - Math.abs(j);
                if (diff < 0)
                    System.out.print("*");
                else
                    System.out.print(s.charAt(diff));
            }
            System.out.println();
        }
    }
}
