package Exercise;

public class E21_forSwitch {
	public static void main(String[] args) {
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
}

