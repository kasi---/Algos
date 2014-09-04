import java.util.Scanner;

public class SelectionSort
{

	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String arr[]= s.split(" ");
		
		int array[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			array[i]= Integer.parseInt(arr[i]);
		}
		
		Sort(array);

		for(int nu : array)
		{
			System.out.println(nu);
		}
	}

	public static void Sort(int array[])
	{
		for(int a=0;a<array.length;a++)
		{
			int minindex=a;
			for(int b=a+1;b<array.length;b++)
			{
				if(array[b]<array[minindex])
				{
					minindex=b;
				}

			}
			
			int temp = array[a];
			array[a]=array[minindex];
			array[minindex]=temp;			

		}
		
	}


}
