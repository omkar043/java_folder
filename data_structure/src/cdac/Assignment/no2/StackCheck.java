package cdac.Assignment.no2;

import java.util.Scanner;



public class StackCheck {
	
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
	boolean isFull()
	{
		if(tos==Maxsize-1) 
			return true;
		else 
			return false;
		
	}
	char peek() {
		return stack[tos];
	}
	
	boolean isEmpty() {
		if(tos==-1)
			return true;
		else
			return false;
	}
  
  
	public static void main(String[] args) {
		StackCheck obj  = new StackCheck();
		Scanner in = new Scanner(System.in);
	  int choice;
	  boolean status = false;
		
		
			
	do {

		
		System.out.println("1.check /n2.result /n0.exit"); 
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
			  if(arr[i]=='{'||arr[i]=='('||arr[i]=='[')	{
				  
			    obj.push(arr[i]);
			  }
			  else if(arr[i]=='}'||arr[i]==')'||arr[i]==']')
			  {
				  if(obj.isEmpty()!=true)
				  {
					  char ch = obj.pop();
				  }
				  else {
					   status = false;
					   break;
				  }
			  
				  
			  }
			  status = obj.isEmpty();
			}
			break;
		case 2:

			if(status!=true)
				System.out.println("There are unmatched opening brackets.");
			else
				System.out.println("All brackets are well-formed.");
		     break;
		}
	}while(choice!= 0)	;		

		
		
		
	
		

	}

}
