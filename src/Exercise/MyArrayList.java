package Exercise;
// 来自互联网，转载，供学习使用，侵权删除。
import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E> {

    //ArrayList<String> strings;
    private static final int DEFAULT_CAPACITY = 10;
    //当前数组的容量
    private int currentCapacity;
    //元素的个数
    public int size;

    private Object[] elementData;

    public MyArrayList(){
        elementData= new Object[DEFAULT_CAPACITY];
        currentCapacity=DEFAULT_CAPACITY;
    }

    /**
     * @param capacity  自定义初始容量
     */
    public MyArrayList(int capacity){

        if(capacity<=DEFAULT_CAPACITY){
            elementData=new Object[DEFAULT_CAPACITY];
            currentCapacity=DEFAULT_CAPACITY;
        }else{
            elementData=new Object[capacity];
            currentCapacity=capacity;
        }
    }


    /**
     * 数组进行扩容
     * @param currentSize 操作之后元素的个数
     */
    private void expandCapacity(int currentSize){
        if(currentSize==currentCapacity){
            //进行扩容
            int newCapacity=(int) (currentCapacity*1.5);
            Object[] newElementData=new Object[newCapacity];
            int index=0;
            for (Object object : elementData) {
                newElementData[index]=object;
                index++;
            }
            this.elementData=newElementData;
            this.currentCapacity=newCapacity;
        }
    }

    /**
     * 添加元素
     * 1，先判断数组是否需要扩容  2，元素添加到数组中最后一个非空元素之后
     * @param e 添加的元素
     */
    public void add(E e){
        int newSize=size+1;
        expandCapacity(newSize);
        if(e!=null){
            elementData[size]=e;
            size++;
        }
    }

    /**
     * 检查下标是否合法
     * @param index 传入的下标值
     * @throws Exception
     */
    private void  checkIndex(int index) throws Exception{
        if(index<0||index>currentCapacity-1){
            throw new Exception("数组下标不合法，当前下标的取值范围是：0~"+(currentCapacity-1));

        }
    }

    /**
     * 向某一下标处添加元素，该下标后面的元素依次后移
     * @param index 传入的下标
     * @param e
     */
    public void add(int index,E e){
        try {
            //检查传入的下标是否合法
            checkIndex(index);
            int newSize=size+1;
            //扩容判断
            expandCapacity(newSize);
            Object[] newElementData=new Object[currentCapacity];
            int initIndex=0;
            for (Object object : elementData) {
                if(initIndex==index&&e!=null){
                    newElementData[initIndex]=e;
                }else if(initIndex>index){
                    newElementData[initIndex]=elementData[initIndex-1];
                }else{
                    newElementData[initIndex]=elementData[initIndex];
                }
                initIndex++;

            }
            this.elementData=newElementData;
            size++;
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }

    /**
     * 修改该下标元素的值
     * @param index
     * @param e
     * @return
     */
    public E set(int index,E e){
        if(e==null){
            return null;
        }
        try {
            //检查传入的下标是否合法
            checkIndex(index);
            E oldValue=get(index);
            elementData[index]=e;
            return oldValue;

        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        return null;
    }

    /**
     * 修改旧元素的值
     * @param oldValue 旧元素
     * @param newValue 新元素
     * @return
     */
    public E set(E oldValue,E newValue){
        if(!contains(oldValue)){
            return null;
        }
        int index=getIndex(oldValue);
        return set(index, newValue);
    }

    /**
     * 根据下标获取元素
     * @param index 传入的下标
     * @return
     */
    public E get(int index){
        try {
            checkIndex(index);
            return (E) elementData[index];
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 获取元素第一次出现时的下标
     * @param e
     * @return
     */
    public int getIndex(E e){
        int  index=-1;
        for (int i = 0; i < elementData.length; i++) {
            if(elementData[i]==null){
                break;
            }
            E temp=(E) elementData[i];
            if(temp.equals(e)){
                index=i;
                break;
            }

        }
        return index;
    }

    /**
     * 删除某一下标的元素
     * 1.检查下标  2.记录该下标对应的元素 3 数组元素移动，从该下标开始，将下一位的值赋给上一位
     * @param index
     * @return
     */
    public E remove(int index){
        try {
            checkIndex(index);
            E value=(E)elementData[index];
            for (int i = 0; i < size; i++) {
                if(i>=index){
                    elementData[i]=elementData[i+1];
                }
            }
            size--;
            return value;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据元素名称删除
     * @param e
     * @return
     */
    public E remove(E e){
        if(contains(e)){
            int index=getIndex(e);
            remove(index);
        }
        return null;
    }

    /**
     * 判断是否包含某一位元素
     * @param e
     * @return
     */
    public boolean contains(E e){
        if(e==null){
            return false;
        }
        for (Object object : elementData) {
            E temp=(E) object;
            if(e.equals(temp)){
                return true;
            }
        }

        return false;
    }
    /**
     * 重写toString方法
     */

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer("[");

        int length=elementData.length;
        for (int i = 0; i < length ; i++) {
            sb.append(elementData[i]);
            if(i!=length-1){
                sb.append(",");
            }

        }

        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyListIterator();
    }

    /**
     * 自定义迭代器
     */
    private class MyListIterator implements Iterator<E> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current<size;
        }

        @Override
        public E next() {
            E value=(E) elementData[current++];
            return value;
        }

    }

    public static void main(String[] args){
        MyArrayList<String> arrayList=new MyArrayList<String>();
        arrayList.add("11");
        arrayList.add("22");
        arrayList.add("33");
        arrayList.add("44");
        arrayList.add("55");
        arrayList.add("66");
        arrayList.add("77");
        arrayList.add("88");
        arrayList.add("99");

        //arrayList.add(113, "2121");
        //arrayList.set(110, "2121");
        arrayList.set("88", "2121");
        arrayList.remove(null);

		/*  for (int i = 0; i < 1000; i++) {
			  arrayList.add(""+i);

		}*/

        for (String string : arrayList) {
            System.err.println("元素："+string);
        }

        //System.err.println( arrayList.contains(null));
        //System.err.println( arrayList.getIndex("33"));
        System.err.println(arrayList.toString());
        System.err.println(arrayList.size);
        System.err.println(arrayList.currentCapacity);

    }
}