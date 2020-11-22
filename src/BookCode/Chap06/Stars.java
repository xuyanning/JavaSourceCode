//********************************************************************
//  Stars.java       Author: Lewis/Loftus
//
//  Demonstrates the use of nested for loops.
//********************************************************************

public class Stars
{
   //-----------------------------------------------------------------
   //  Prints a triangle shape using asterisk (star) characters.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int MAX_ROWS = 9;

      for (int i = 1; i <= MAX_ROWS; i++)
      {
         for (int j = 1; j <= i; j++)
            System.out.print ("*");

         System.out.println();
      }
      printMulTable(9);
      printTable1(5);
      printCircle();
   }

   public static void printMulTable(int n){
      for (int i = 1; i <= n; i++)
      {
         for (int j = 1; j <= i; j++)
            System.out.print (i + "*" + j + "=" + i*j + "\t");

         System.out.println();
      }
   }

   public static void printTable1(int n){
      for (int i = -n; i <= n; i++)
      {
         for (int j = -n; j <= n; j++) {
            if (Math.abs(i)+Math.abs(j)==n)
               System.out.print("*" );
            else
               System.out.print(" ");
         }

         System.out.println();
      }
   }
   public static void printCircle(){
      int r=15;//圆形的半径
      for (int y = 0; y <= 2 * r; y += 2) {//y的步长为2,改变y的步长可以将圆形变成椭圆
         int x = (int)Math.round(r - Math.sqrt(2 * r * y - y * y));
         int len = 2 * (r - x);

         for (int i = 0; i <= x; i++) {
            System.out.print(' ');
         }
         System.out.print('*');

         for (int j = 0; j <= len; j++) {
            System.out.print(' ');
         }
         System.out.println('*');

      }
   }
}
