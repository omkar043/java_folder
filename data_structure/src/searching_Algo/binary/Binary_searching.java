package searching_Algo.binary;
import java.util.Scanner;

public class Binary_searching {
	int arr[];
	void createArray(int size)
	{
		arr = new int [size];
		System.out.println("Enter the elements ");
		Scanner in = new Scanner(System.in);
		
		for(int i = 0;i < size;i++)
		{
			int input = in.nextInt();
			arr[i] = input;
		}
	}
	void printArray()
	{
		for(int i = 0;i < arr.length;i++)
		{
			
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	int binarySearch(int start,int end,int key)
	{
		if(start == end)
		{
			if(key == arr[start])
			{
				return start;
			}
			else
				return -1;
			
		}
		else
		{
			int mid = (start + end)/2;
			if(key == arr[mid])
			{
				return mid;
				
			}
			else {
				 if(key <= arr[mid])
				 {
					 return binarySearch( start, end - 1,key);
				 }
				 else
				 {
					 return binarySearch(start + 1,end,key);
				 }
			}
		}
		
	          
		
	
	
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_searching obj = new Binary_searching();
		obj.createArray(6);
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the key ==>");
		int key = s.nextInt();
		System.out.println("Enter the start position");
		int start = s.nextInt();
		System.out.println("Enter the end pos");
		int end = s.nextInt();
		obj.binarySearch(start,end, key);
	}

}
