package Exercise;

public class E33_LinkListTest {
    public static void main(String[] args){
        E33_LinkList list = new E33_LinkList();
        list.addNodeToFirst(3);
        list.addNodeToFirst(4);
        list.addNodeToFirst(5);
        list.addNodeToFirst(6);
        System.out.println(list);
        list.reverseList(2);
        System.out.println(list);
    }
}
