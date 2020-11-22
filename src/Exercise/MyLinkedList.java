package Exercise;

public class MyLinkedList<T> {

    private static class Node<E> {
        E item;      // 真正存储的数据
        Node<E> next;  // 前一个节点引用地址
        Node<E> previous;  // 后一个节点引用地址
        Node(E element){
            this(null, element,null);
        }

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.previous = prev;
        }
    }
    /**
     * 第一个节点
     */
    private Node firstNode;


    /**
     * 最后一个节点
     */
    private Node lastNode;


    /**
     * 链表大小
     */
    private int size;


    /**
     * 添加节点到数组中
     *
     * @param o 节点数据
     */
    public void add(T o) {
        Node node = new Node(o);


        if (firstNode == null) {
            firstNode = node;
        } else {
            node.previous = lastNode;
            node.next = null;
            lastNode.next = node;
        }

        lastNode = node;

        size++;
    }


    /**
     * 根据索引,删除数组中元素
     *
     * @param index 索引角标
     */
    public void remove(int index) {
        checkRound(index);

        Node temp = getNode(index);

        if (temp != null) {
            Node up = temp.previous;
            Node down = temp.next;

            if (up != null) {
                up.next = down;
            }

            if (down != null) {
                down.previous = up;
            }

            // 删除第一个元素的时候
            if (index == 0) {
                firstNode = down;
            }

            // 删除最后一个元素的时候
            if (index == size - 1) {
                lastNode = up;
            }

            size--;
        }

    }


    /**
     * 插入一个元素在指定位置
     *
     * @param index 指定位置索引
     * @param o     插入的元素
     */
    public void insert(int index, T o) {

        Node newNode = new Node(o);

        // 判断范围
        checkRound(index);

        Node temp = getNode(index);

        if (temp != null) {

            // 第一个元素和最后一个元素的时候
            if (index == 0) {
                firstNode = newNode;
                newNode.next = temp.next;
            } else if (index == size - 1) {
                Node up = temp.previous;
                isNull(up == null, "前一个元素为空");
                up.next = newNode;
                newNode.previous = up;
            } else {
                Node up = temp.previous;
                isNull(up == null, "前一个元素为空");
                up.next = newNode;
                newNode.previous = up;

                newNode.next = temp;
                temp.previous = newNode;
            }
        }

    }


    /**
     * 优化版,提高查找效率,折半判断
     *
     * @param index 索引角标
     * @return 索引对应的值
     */
    public T get(int index) {
        checkRound(index);

        Node node = getNode(index);

        return node != null ? (T) node.item : null;
    }


    /**
     * 根据角标,获取节点
     *
     * @param index 传入角标
     * @return 获取节点
     */
    private Node getNode(int index) {
        Node node;
        // size>>1 除以2
        if (index <= (size >> 1)) {
            node = firstNode;

            for (int i = 0; i < index; i++) {

                node = node.next;
            }
        } else {
            node = lastNode;

            for (int i = size - 1; i > index; i--) {

                node = node.previous;
            }
        }
        return node;
    }

    /**
     * 审核传入的角标范围是否越界
     *
     * @param index 传入角标
     */
    private void checkRound(int index) {
        // 判断索引范围
        isNull(index < 0 || index > size - 1, "索引不合法!" + index);
    }

    /**
     * 判断空指针问题
     *
     * @param b      判断条件
     * @param string 抛出异常的原因
     */
    private void isNull(boolean b, String string) {
        if (b) {
            throw new RuntimeException(string);
        }
    }

    /**
     * 获取数组中元素
     *
     * @return 元素数组
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        Node temp = firstNode;

        while (temp != null) {
            stringBuilder.append(temp.item).append(",");
            temp = temp.next;
        }

        stringBuilder.setCharAt(stringBuilder.length() - 1, ']');

        return stringBuilder.toString();
    }


}


