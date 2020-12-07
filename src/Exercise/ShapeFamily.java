package Exercise;
// 作者，徐木鱼，供实验参考
// shape, circle, square继承关系树。
// JKD Arrays提供了缺省的Sort方法，支持Comparable接口以及Comparator接口两种使用方法，后者可以实现多规则比较
// 如果不使用JDK，自己也可以实现Sort，展示代码为shapeSort1，与shapeSort2，后者展示了基于Comparator接口的多规则排序

import java.util.Arrays;
import java.util.Comparator;

public class ShapeFamily {
    public static void main(String[] args) {
        Shape[] shps = {new Circle(1),new Circle(3,0,2),new Square(0,2,1)};
        if (((Circle)shps[0]).tangent((Circle)shps[1]))
            System.out.println("externally-tangent ");

        Arrays.sort(shps);
        shapeSort1(shps);
        for (Shape shp : shps){
            System.out.println(shp);
        }

        Arrays.sort(shps,new Comparator2());
        shapeSort2(shps,new Comparator1());
        for (Shape shp : shps){
            System.out.println(shp);
        }
    }

    public static void shapeSort1(Shape[] list){
        for (int index = 1; index < list.length; index++)
        {
            Shape key = list[index];
            int position = index;
            //  Shift larger values to the right
            while (position > 0 && key.compareTo(list[position-1]) < 0)
            {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }

    public static void shapeSort2(Shape[] list, Comparator<Shape> c){
        for (int index = 1; index < list.length; index++)
        {
            Shape key = list[index];
            int position = index;
            //  Shift larger values to the right
            while (position > 0 && c.compare(key,list[position-1])  < 0)
            {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }
}

abstract class Shape implements Comparable<Shape>{
    private double centerX, centerY;
    Shape(){
        this(0,0);
    }
    Shape(double x,double y){
        centerX = x;
        centerY = y;
    }
    abstract double getArea();
    abstract double getCircumference();

    public int compareTo(Shape other){
        double d = this.getArea() - other.getArea();
        if (Math.abs(d) < 0.001) return 0;
        else if (d>0) return 1;
        return -1;
    }
    double getX(){
        return centerX;
    }
    double getY(){
        return centerY;
    }


}

class Circle extends Shape{
    double radius;
    Circle( double x, double y, double r){
        super(x,y);
        radius = r;
    }
    Circle(double r){
        this(0,0,r);

    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getCircumference()
    {
        return radius * 2 * Math.PI;
    }
    boolean tangent(Circle other){
        // 补充代码，计算圆this与other是否外切
        double d = Math.sqrt(Math.pow(getX()-other.getX(),2)+Math.pow(getY()-other.getY(),2));
        return (Math.abs(d - (radius + other.radius))< 0.01);

    }

    public String toString(){
        return "Circle (" + getX() + " , " + getY() + " , " + radius + ")";
    }
}

class Square extends Shape{
    double lengthofSide;
    Square( double x, double y, double l){
        super(x,y);
        lengthofSide = l;
    }
    double getArea(){
        return lengthofSide * lengthofSide;
    }
    double getCircumference()
    {
        return lengthofSide * 4;
    }
    public String toString(){
        return "Square (" + getX() + " , " + getY() + " , " + lengthofSide + ")";
    }
}
class Comparator1 implements Comparator<Shape> {
    public int compare(Shape o1, Shape o2) {
        double  result = o1.getArea() - o2.getArea();
        if (result<0) return -1  ;
        else if (result>0) return 1;
        return  0;
    }
}
class Comparator2 implements Comparator {
    public int compare(Object o1, Object o2) {
        double  result = ((Shape)o1).getArea() - ((Shape)o2).getArea();
        if (result<0) return 1  ;
        else if (result>0) return -1;
        return  0;
    }
}