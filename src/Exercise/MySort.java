package Exercise;

public class MySort {
    public static void main(String[] args){
        int[] a = {1,3,9,8,6};
        double[] d = {1,3,9,8,6};
        People[] p = {new People("a",15),new People("d",18),
                new People("s",40),new People("c",2)};
        String[] s;
        sort1(p);

        for (People b:p){
            System.out.print(b + "\t");
        }
    }
    public static void sort1(int[] a){
        for (int index = 0; index < a.length-1; index++){
            int min = index;
            int num = a[min];
            for (int i = index+1; i<a.length; i++){
                if (a[i] < num){
                    num = a[i];
                    min = i;
                }
            }
            num = a[min];
            a[min] = a[index];
            a[index] = num;
        }
    }
    public static void sort1(double[] a){
        for (int index = 0; index < a.length-1; index++){
            int min = index;
            double num = a[min];
            for (int i = index+1; i<a.length; i++){
                if (a[i] < num){
                    num = a[i];
                    min = i;
                }
            }
            num = a[min];
            a[min] = a[index];
            a[index] = num;
        }
    }

    public static void sort1(MyCompare[] a){
        for (int index = 0; index < a.length-1; index++){
            int min = index;
            MyCompare num = a[min];
            for (int i = index+1; i<a.length; i++){
                if (a[i].myCompare(num) < 0){
                    num = a[i];
                    min = i;
                }
            }
            num = a[min];
            a[min] = a[index];
            a[index] = num;
        }
    }
}

interface MyCompare{
    int myCompare(Object other);
}

class People implements MyCompare{
    String name;
    int age;
    People(String n,int age){
        name = n;
        this.age = age;
    }
    public int myCompare(Object o){
        return name.compareTo(((People)o).name);
    }
    public String toString(){
        return  name;
    }
}
