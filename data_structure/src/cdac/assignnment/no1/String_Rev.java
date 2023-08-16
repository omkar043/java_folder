package cdac.assignnment.no1;
import java.util.Scanner;

public class String_Rev {
	char stack[];
	int Maxsize,tos;
	
	
	void init(int size)
	{
		
		stack = new char [size];
		Maxsize = size;
		tos =-1;
		 
		
	}
	void push(char e)
	{
		tos++;
		stack[tos] = e;
		
	}
	char pop()
	{
		char  temp = stack[tos];
		tos--;
		return temp;
	}
  
  
	public static void main(String[] args) {
		String_Rev obj = new String_Rev();
		Scanner in = new Scanner(System.in);
	  int choice;
	  
		
		
			
	do {

		
		System.out.println("1.push /n2.pop /n0.exit"); 
		 choice = in.nextInt();
		in.nextLine();
		
		switch(choice)
		{
		case 1 :
			
		 
		   System.out.println("Enter the String = ");
		   String string = in.nextLine();
		   obj.init(string.length());
		   char[] arr = string.toCharArray(); 
			for(int i=0;i<=obj.Maxsize-1;i++) {
				obj.push(arr[i]);
				
			}
			break;
		case 2 :	
			for(int i=0;i<=obj.Maxsize-1;i++) {
				System.out.print( obj.pop());
			}
			System.out.println();
			break;
		}
	}while(choice!= 0)	;		

		
		
		
		

	}

}
