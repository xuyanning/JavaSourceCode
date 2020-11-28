package Exercise;

public class SumFor {

	public static void main(String[] args) {
		double sum = 0;
		double x =1;
		double y = 1;

		for (int i =1 ; i<=100; i+=2)
		{
			
			sum += x * y;
			System.out.println("i = " + i + "\t" + "sum so far is " + sum);
			x = -x;
			y = y /((i + 1) * (i + 2)) ;
		}
		
		System.out.println("sum = " + sum);

	}

}
