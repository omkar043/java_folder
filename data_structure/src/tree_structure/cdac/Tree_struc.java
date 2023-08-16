package tree_structure.cdac;
import java.util.Scanner;

class DNode{
	  int data;
	  DNode left ,right;
	  DNode(int data)
	  {
		  this.data=data;
		  right=left=null;
		  
	  }
}

public class Tree_struc {
	   DNode root;
	   static int counter;
	   void createnode()
	   {
		   root=null;
	   }
	   void insertNode(DNode n,DNode r)
	   {
		   if(root == null)
			   root= n;
		      else if(n.data < r.data)
		      {
		    	if(r.left == null)
		    	{
		    		r.left = n; 
		    	}
		    	else
		    		insertNode(n,r.left);
		    	
		      }else {
		    	     if(r.right == null)
		    	     {
		    	    	 r.right = n;
		    	     }
		    	     else
		    	    	 insertNode(n,r.right);
		      }
			     
		   
	   }
	    void inorder(DNode r)
	   {
		   if(r != null)
		   {
			   inorder(r.left);
			   System.out.println(r.data+"<--");
			   inorder(r.right);
		   }
		   
	   }
	   void preorder(DNode r)
	   {
		   if(r != null)
		   {
			   inorder(r.left); 
			   inorder(r.right);
			   System.out.println(r.data+"<--");
		   }
	   }
	   void postorder(DNode r)
	   {
		   if(r != null)
		   {
			   System.out.println(r.data+"<--");
			   inorder(r.left); //Recursion used for traversing the node in left 
			   inorder(r.right);//Recursion used for traversing the node in right
		   }
	   }
	   void NodeCount(DNode r)
	   {
		   if(r != null)
		   {
			  NodeCount(r.left);
			  Tree_struc.counter++;
			  NodeCount(r.right);
			  
			  
		   }
	   }
	   void LeafCount(DNode r)
	   {
		   if(r != null)
		   {
			   LeafCount(r.left);
			   if(r.left == null && r.right == null)
			   {
				   Tree_struc.counter++;
			   }
			   LeafCount(r.right);
		   }
	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_struc obj = new Tree_struc();
		Scanner sc = new Scanner(System.in);
		obj.createnode();
		int choice;
		
		do {
			int e;
			System.out.println("\n1. Insert node element \n2. inorder \n3. preorder \n4. postorder\n0. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
					System.out.println("Enter Element");
					e = sc.nextInt();
					DNode n1 = new DNode(e);
					obj.insertNode(obj.root,n1);
				break;
			case 2:
				System.out.println("inorder");
			
			   obj.inorder(obj.root);
			
			break;
			case 3:
				obj.preorder(obj.root);
				break;
			case 4:
				obj.postorder(obj.root);
			break;
			
			case 0:
				System.out.println("coded by Omkar");
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}while(choice!=0);
		

	}

}
