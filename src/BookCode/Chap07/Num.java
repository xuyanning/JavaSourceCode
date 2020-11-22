//********************************************************************
//  Num.java       Author: Lewis/Loftus
//
//  Represents a single integer as an object.
//********************************************************************

public class Num
{
   private int value;
   public static void main(String[] args)    {
      int[] c = {1,2,3,4,5};
      int[] d = {7,8,9,8,7};
      d = m(c,d[4]); c[0] = 9;
      for (int i:d) System.out.print(i + "\t");
   }
   public static int[] m(int[] a,int b){
      a[1]= 6; b = 6;
      return a;
   }
   public static void swap(int[] a, int[] b){
      if (a.length != b.length)
         return;
      int i = 0,temp;
      while (i < a.length)     {
         temp = a[i];  a[i] = b[i];  b[i] = temp;
      }
   }
   public static void swap2(int[] a, int[] b){
      int[] ta;   ta = a;   a = b;   b = ta; // 错在哪儿对么？
   }


   //-----------------------------------------------------------------
   //  Sets up the new Num object, storing an initial value.
   //-----------------------------------------------------------------
   public Num (int update)
   {
      value = update;
   }

   //-----------------------------------------------------------------
   //  Sets the stored value to the newly specified value.
   //-----------------------------------------------------------------
   public void setValue (int update)
   {
      value = update;
   }

   //-----------------------------------------------------------------
   //  Returns the stored integer value as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return value + "";
   }
}
