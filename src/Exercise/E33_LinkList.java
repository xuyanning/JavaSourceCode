package Exercise;

class Node {
	Node next = null;
	int data;
	public Node(int data, Node n) {
		this.data = data;
		next = n;
	}
}

public class E33_LinkList {
	Node head = null;
	public String toString(){
		String str="";
		Node p = head;
		while (p !=null) {
			str += "\t" + p.data;
			p = p.next;
		}
		return str;
	}
    public void addNode(int d) {
        Node newNode = new Node(d,null);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    public void addNodeToFirst(int d){
    	head = new Node(d,head);
    }

    public boolean insertNode(int n, int data){
		Node p = head;
		if (n==0) {head= new Node(data,head);return true;}
		if (p== null) return false;// 两种特殊情况
		if (n==1) {p.next = new Node(data,p.next); return true;}
		if (p.next== null) return false;
		for (int i=0;i<n - 2;i++){  // p由头节点走n -2步
			p = p.next;
			if (p.next== null) return false; //p是最后一个节点了，但还没走到位置
		}
		p.next.next =  new Node(data,p.next.next);
		return true;
	}

	public void reverseList(){
		Node p= head;
		Node pp;
		head = null;
		while (p!=null)	{
			pp=p.next;
			p.next = head;
			head = p;
			p = pp;
		}
	}
	//第n个位置开始逆转，假设 1<n<length
	public void reverseList(int n){
		Node pn1= head;
		for (int i=1;i<n-1;i++) pn1=pn1.next;
		Node p=null,pn2=null;
		while (pn1.next!=null)	{
			p=pn1.next;
			pn1.next = pn1.next.next; //删除
			p.next = pn2;
			pn2 = p; //头部插入
		}
		pn1.next = pn2;
	}

	public void removeBiggerThan(int d){
    	while (head != null && head.data > d )
    		head = head.next;    	
    	if (head == null) 
    		return;
    	Node p = head;
    	while (p.next != null){
    		if (p.next.data > d) 
    			p.next = p.next.next;
    		else p = p.next;
    	}
    }

    public void insertSortedList(int d) {
    	Node p=head;
    	Node prevp = null;
    	while(p!=null && p.data <d){
    		prevp = p;
    		p = p.next;
    	}
    	if (prevp == null)
    		head = new Node(d,head);
    	else if (p != null && p.data >d)
    		prevp.next = new Node(d,p);
    }
	void insertToSortedList2(int data) {
		Node p=head;
		if (head==null || head.data>data){
			head=new Node(data,head);
			return;
		}
		while(p.next!=null && p.next.data<data){
			p = p.next;
		}
		p.next = new Node(data,p.next);
	}
	void insertToSortedList(Node n) {
		Node p=head;
		if (head==null || head.data>n.data){
			n.next = head; head = n; return;
		}
		while(p.next!=null && p.next.data<n.data){
			p = p.next;
		}
		n.next = p.next;
		p.next = n;
	}
	void sortList(){
		Node head2 = head;
		Node p;
		head = null;
		while (head2!=null){
			p=head2;
			head2= head2.next;
			insertToSortedList(p);
		}
	}

	void mergeSortedList(Node head1,Node head2){

		if(head1==null){ head =  head2; return; }
		if(head2==null) {head = head1; return; }
		if(head1.data>head2.data){
			head=head2;
			head2=head2.next;
		}
		else{
			head=head1;
			head1=head1.next;
		}
		head.next=null;
		Node tail= head;
		while(head1!=null && head2!=null){
			if(head1.data>head2.data){
				tail.next=head2;
				head2=head2.next;
			}
			else{
				tail.next=head1;
				head1=head1.next;
			}
			tail=tail.next;
			tail.next=null;
		}
		tail.next=(head1==null)?head2:head1;
	}

}
