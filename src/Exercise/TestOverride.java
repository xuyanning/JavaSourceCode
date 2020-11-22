package Exercise;

public class TestOverride {
	public static void main(String[] args){
        F2 f = new S2();
        f.printMessage();	}
}

class F2{
    void printMessage(){
        System.out.println("F2-Message");
        this.m1();
    }
    void m1()    {
        System.out.println("F2 - m1()");
    }
}
class S2 extends F2{
    void printMessage(){
        super.printMessage();
        System.out.println("S2-Message");
    }
    void m1(){
        System.out.println("S2 - m1()");
    }
}

class F6{
	int i= 6;
//	String toString(){
//		return i+ "";
//	}
	boolean equals(F6 f2){
		return i== f2.i;
	}
//	boolean equals(Object f2){ // Ϊʲô����
//		return false;
//	}
}

class F7{
	private int i=5;
	private static int j = 6;
	boolean equals(F6 f2){
		return i== f2.i;
	}
}
//public boolean equals(Object f2){ //
//	return i == ((F6)f2).i; //
//}