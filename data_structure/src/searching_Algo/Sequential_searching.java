package searching_Algo;
import java.util.Scanner;
public class Sequential_searching {
	   int a[];
	   Scanner in = new Scanner(System.in);
			   
	   void createArray(int size)
	   {
		   a = new int[size];
		   System.out.println("Enter "+size+"elements");
		   for(int i = 0;i < size;i++)
		   {
			   System.out.println("Enter the elements");
			   a[i] = in.nextInt();
		   }
		  
	   }
	   void printArray()
	   {
		  System.out.println("Elements in  Array");
		  for(int i = 0;i < a.length;i++)
		  {
			  System.out.println(a[i]);
			  
		  }
	   }
	   int searchElement(int key)
	   { 
		   for(int i = 0;i < a.length;i++)
		   {	   
		     if(a[i] == key)
			  return (i); 
		     
		   
		   }
		   return (-1);
		   
	   }

	public static void main(String[] args) {
		Sequential_searching obj = new Sequential_searching();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		 obj.createArray(input);
		 obj.printArray();
		 int size = sc.nextInt();
		 int res = obj.searchElement(size);
		 if(res == -1)
		 {
			 System.out.println("element not found");
		 }
		 else
			 System.out.println("element found at pos " +(res + 1));
		
		
		

	}

}
