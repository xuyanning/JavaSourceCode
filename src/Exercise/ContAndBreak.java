package Exercise;

public class ContAndBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	//基本概念
	public static void m1(){
		System.out.println("Break Test");
		for (int i = 1; i<= 5; i++){
			System.out.print(i + "\t");
			if (i > 2) break;
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("Continue Test");
		for (int i = 1; i<= 5; i++){
			System.out.print(i + "\t");
			if (i > 2) continue;
			System.out.print(i + "\t");
		}
	}
	// 高级应用，continue标号版
	public static void printPrime(){
		int count = 0;
		PrimeLabel:
		for (int i = 2; i <= 100; i++)
		{
			for (int j = 2; j<i; j++)
				if (i % j == 0){
					continue PrimeLabel;
				}
			System.out.print(i + "\t");
			count ++;
			if (count % 5 == 0)
				System.out.println();
		}
	}
	// 高级应用，break版
	public static void printPrime2(){
		boolean isPrime;
		int count = 0;
		for (int i = 2; i <= 100; i++)
		{
			isPrime = true;
			for (int j = 2; j<i; j++)
				if (i % j == 0){
					isPrime = false;break;
				}
			if (isPrime) {
				System.out.print(i + "\t");
				count++;
				if (count % 5 == 0)
					System.out.println();
			}
		}
	}
	//测试题目
	//测试Continue后是否执行for循环的修正语句
	public static void m2(){
		for (int num = 1; num<=5; num++){
			if (num %2 == 0) continue;
			System.out.print(num);
		}

		for (int num = 5;;num+=6){
			if (num % 7 ==0) break;
			System.out.print(num + " ");
		}
	}

		//       String str = "abc";
//       System.out.print(str.substring(str.length()-1));
//        String str = '1' + 2020;
//        char ch = '1' + 2020;
//        int i = '1' + 2020;
//        Integer x = '1' + 2020;
//        System.out.print('1' + 2020);

}
