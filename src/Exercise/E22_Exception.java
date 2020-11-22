package Exercise;

class ZeroException extends Exception{ }
public class E22_Exception {
	static String str = "a13";
	static int index=0;
	public static void main(String args[]) {
		try{ 
			while(true) {f();  index++;}
		} catch(Exception e) {
			System.out.println("Handle UnknownException");}
	}
	public static void f() {
		try{			
			System.out.println("start index:" + index);
			System.out.println("number = " + g());	
		}catch (ZeroException e){
			System.out.println("Handle ZeroExecution");
		}
		finally{System.out.println("end index:"+index + "\n");	}
	}
	public static String g() throws ZeroException{
		try{ 
			int number = Integer.parseInt("a03".charAt(index)+"");
			if (number==0) 
				throw new ZeroException();
			return number+"";
		}catch (NumberFormatException e){
			System.out.println("Not a Number");	}
		return "error";
	}
}

class Exception2 {
	public static void main(String[] args) {
		String[] codes = { "a201a", "a201", "a1017" };
		for (int i = 0; i <= 4; i++) {
			try {
				System.out.println("Analyzing code: " + codes[i]);
				analyseCode(codes[i]);
				System.out.println("********");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Out of bounds, Unsuccessfully ended ");
				return;
			} catch (Exception e) {
				System.out.println("Unknown Exception ");
			}
		}
		System.out.println("Analyse Completed ");
	}

	public static void analyseCode(String code) throws Exception {
		int syear;
		try {
			syear = Integer.parseInt(code.substring(1, 5));
			if (syear > 3000 || syear < 1000)
				throw new Exception();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Improper length: " + code);
			return;
		} catch (NumberFormatException e) {
			System.out.println("Improper Format: " + code);
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Completed: " + code);
	}
}

