package Exercise;

public class ContAndBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
}
