package data_structure;
import java.util.Scanner;

public class StackExample {
       int stack[],tos,Maxsize;
       void createStack(int size)
       {
    	   stack = new int[size];
    	   
    	   Maxsize = size;
    	   tos = -1;
    			   
    	    
       }
       void push(int e)
       {
    	   tos++;
    	   stack[tos]=e; 
       }
       boolean isfull()
       {
    	   if(tos == Maxsize -1)
    	   {
    		   return true;
    	   }
    	   else
    		   return false;
       }
       int pop()
       {
    	   int temp = stack[tos];
    	   tos--;
    	   return(temp);
    	   
    	   
       }//in static stack algorithm nothing is deleted it gets ready for overriding
       int peek()
       {
    	  return (stack[tos]);
    	   
       }
       boolean isEmpty()
       {
    	   if(tos == -1)
    	   {
    		   return true;
    	   }
    	   else
    		   return false;
       }
       void printstack()
       {
    	   for(int i = tos ;i > -1;i--)
    	   {
    		   System.out.println(stack[i]);
    	   }
       }
       

public static void main(String args[])
{
	int choice;
	StackExample obj = new StackExample();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the size of stack");
	int size = in.nextInt();
	obj.createStack(size);
	do {
		System.out.println("\n1. push() \n2.pop() \n3.peek() \n4.print \n0.Exit ");
		choice = in.nextInt();
		switch(choice)
		{
		case 1 :
			 if(obj.isfull() !=true)
			 {
				 System.out.println("enter the element");
				 int a = in.nextInt();
				 obj.push(a);
				 
			 }
			 else {
				     System.out.println("stack is full");
			 }
			 break;
		case 2 :
			 if(obj.isEmpty()!= true)
			 {
				 
			     System.out.println("The poped number is "+ obj.pop());
			     
			 }
			 else
				 System.out.println("the stack is empty");
			 break;
			 
			 
		case 3 :
			 if(obj.isEmpty()!= true)
			 {
			    System.out.println("The topmost element is "+obj.peek());
			 }
			 else
				 System.out.println("the stack is empty");
			 break;
			    
			    
		case 4 :
			 if(obj.isEmpty()!= true)
			 {
			  System.out.println("The elements inside the stack are " );
			 
			  obj.printstack();
			 }
			 else
				 System.out.println("the stack is empty");
			  break;
			  
			    
		case 0 :
			    System.out.println("Thank you !!! codded by Omkar ");
			    break;
			   
		}
		
		
	}while(choice != 0);
}
}

