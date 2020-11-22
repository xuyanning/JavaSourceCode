package Exercise;


public class E22_Exception {
	static class ZeroException extends Exception{ }
	public static void main(String args[]) {
		String str = "2021a";
		for (int i = 2; i <= str.length(); i++) {
			try {
				System.out.println("index:" + i);
				System.out.println("number = " + f(str.charAt(i)));
			} catch (ZeroException e) {
				System.out.println("ZeroExecution");
			} catch (Exception e) {
				System.out.println("UnknownException");
			} finally {
				System.out.println("finally\n");
			}
		}
	}

	public static String f(char ch) throws ZeroException{
		try{ 
			int number = Integer.parseInt(ch+"");
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

class Exception3 {
	public static int f(String s) throws Exception{
		try {
			return Integer.parseInt(s.substring(1,4));
		}
		catch (NumberFormatException e) {
			System.out.println("Improper score value");
			return -1;
		}
		finally {
			System.out.println("Finally in f()");
		}
	}
	public static void main(String[] args) {
		String[] sArray= {"a0123","a45","ab789"};
		for(int i=0;i<=3;i++) {
			try {
				System.out.println(f(sArray[i])+"\n");
			}
			catch (Exception e) {
				System.out.println("Caught OtherException\n");
			}
		}
	}
}
