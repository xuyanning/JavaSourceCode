package Exercise;

class F{
	private int x1;
	int x2;
	protected int x3;
	public int x4;
}
class S extends F{
	public String toString(){
//		return "" + x1 + x2 + x3 + x4;
        return "" + x2 + x3 + x4;
	}
}
//class S2 extends F2{
//	public String toString(){
//		return "" + x1 + x2 + x3 + x4;
//	}
//}

public class VisibilityDemo {
	private int x5 = 5;
	public static void main(String[] args) {
		S s = new S();
//		System.out.println(s.x2 + s.x3 + s.x4);
//		S2 s2 = new S2();
//		System.out.println(s2.x2 + s2.x3 + s2.x4);
		System.out.println(new VisibilityDemo().x5);
	}
}
