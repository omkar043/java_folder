package data_structure;

import doublyCircular.Node;

class Node{
	   int data;
	   Node left,right;
	   Node(int data)
	   {
		   this.data = data;
		   this.left = null;
		    left = right = null;
		   
	   }
	   
}


public class Doubly_LinkList {
	 Node root;
	 void createNode()
	 {
		 root = null;
	 }
	 void insertLeft(int e)
	 {
		 Node n = new Node (e);
		 if(root == null)
		 {
			 root = n;
		 }
		 else
		 {
			 n.right = root;
			 root.left = n;
			 root = n;
		 }
		 
	 }
	 void deleteLeft()
	 {
		 if(root == null)
		 {
			 System.out.println();
		 }
	 }
	 void rprintList()
	 {
		 if(root == null)
			 System.out.println("List is empty");
		 else
		 {
			 Node t = root;
			 while(t.right != null )
			 {
				 t = t.right;
			 }
			 while(t.left != null)
			 {
				 
				 System.out.println(t.data);
				 t = t.left;
				 
			 }
			 
				 
		 }
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
