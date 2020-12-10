package Exercise;

public class E25_Sort {
	public static void main(String[] args) {
		int[] arr={1,2,2,4,4,6};
		int u=0, i=1;
		while (i < arr.length){
			if (arr[i++]!=arr[u]){
				int temp=arr[++u];
				arr[u]=arr[i-1];
				arr[i-1]=temp;
			}
		}
		for(int value: arr)
			System.out.print(value+" ");
	}
	public static void intSort (int[] list)
	{
		int min;
		int temp;

		for (int index = 0; index < list.length-1; index++)		{
			min = index;
			for (int scan = index+1; scan < list.length; scan++)
				if (list[scan] - list[min] < 0)
					min = scan;
			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}
	
}




