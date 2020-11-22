package Exercise;

class B{
	public B(){
		System.out.print("B!\t");
	}
	public void f(double d){
		g(d);
	}
	public void g(int i){
		System.out.println("g(int "+i+") in B!");
	}
	public void g(double d){
		System.out.println("g(double "+d+") in B!");
	}	
}
class C extends B{
	public C(int i){
		System.out.println("Constructor: " + i);
	}
	public void f(int i){
		g(i);
	}
	public void g(double d){
		System.out.println("g(double "+d+") in C!");
	}
}
public class E24_Inheritance {
	public static void main(String[] args){
		B obj1=new C(1);
		obj1.f(2);
		obj1.g(3);
		obj1.g(4.0);
		C obj2=new C(5);
		obj2.f(6);
		obj2.g(7);
		obj2.g(8.0);
	}
}
