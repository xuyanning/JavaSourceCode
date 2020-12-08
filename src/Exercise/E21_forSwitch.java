package Exercise;

public class E21_forSwitch {
	public static void main(String[] args) {
		E21_FlowCtrl.m1();

	}
}

class E21_FlowCtrl{
	public static void m1(){
		int[][] a = new int[3][3];
		int[][] b = {{1,0},{0,1}};
		for (int i = 0;i<a.length;i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = (i == j)? 2:0;
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("***");
		for (int i = 0;i<a.length-1;i++) {
			for (int j = 0; j < a[0].length-1; j++) {
				System.out.print(a[i][j]*b[0][0]+a[i][j+1]*b[0][1]+
						a[i+1][j]*b[1][0]+a[i+1][j+1]*b[1][1]);
			}
			System.out.println();
		}
	}
	public static void m2(){
		int[] arr={63,82,100,95};
		for(int value: arr){
			switch(value/10){
				case 9:
					System.out.println("Good!"+value); break;
				case 8:
				case 7:
				case 6:
					System.out.println("Pass!"+value);
				default:
					System.out.println("Fail!"+value);
			}
		}
	}
	public static void m3(int[] a){	a[0] = 1;	}
	public static void m4(int... a){	a[0] = 2;	}
	public static void m5(Integer... a){ a[0] = 3; }
	public static void m6(int a){a = 4;}
	public static void m7(){
		int[] a={0};
		m3(a);System.out.println(a[0]);
	}

	public static void m8(){
		String str = "Java";
		for (int i=0;i<str.length();i++)
			for (int j=0; j<str.length();j++){
				
			}


	}

}
