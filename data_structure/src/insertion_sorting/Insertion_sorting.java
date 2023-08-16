package insertion_sorting;

import java.util.Scanner;

public class Insertion_sorting {
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
			
			System.out.print(a[i]);
		}
		System.out.println();
		
	}
	 void 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	}

}
