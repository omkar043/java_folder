package selection_sort;

import java.util.Scanner;

public class Selection_sorting {
	int a[];
	void createArray(int size)
	{
		a = new int [size];
		System.out.println("Enter the elements ");
		Scanner in = new Scanner(System.in);
		
		for(int i = 0;i < size;i++)
		{
			int input = in.nextInt();
			a[i] = input;
		}
	}
	void printArray()
	{
		for(int i = 0;i < a.length;i++)
		{
			
			System.out.println(a[i]);
		}
		System.out.println();
	}
	void selection_sort()
	{
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 0;j < a.length;j++)
			{
				if(a[j] < a[i])
				{
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		Selection_sorting obj = new Selection_sorting();
		obj.createArray(6);
		obj.selection_sort();
		obj.printArray();
       
	}

}
