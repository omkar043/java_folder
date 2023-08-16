package doublyCircular.repeat;

class Node{
	  int data;
	  Node next;
	  Node(int data)
	  {
		  this.data = data;
		  next = null;
	  }
}
public class Link_list_2 {
      Node root;
      
      public void create_LinkList()
      {
    	  root = null;
      }
      public void add_at_firstPos(int data)
      {
    	  Node head = new Node(data);
    	  if(root == null)
    	  {
    		  root = head;
    	  }
    	  else
    	  {
    		 Node temp = head.next;
    		 head.next = temp;
    	  }
    		  
      }
  public void add_at_lastPost(int data)
  {
	  Node lsr_pos = new Node(data);
	  Node temp = root;
	  if(root == null)
	  {
		  root = lsr_pos;
	  }
	  else
	  {	  
	    while(temp != null)
	   {
		  temp = temp.next;
		  
	    }
	  
	    temp = lsr_pos; 
	  }
  }
  public void delete_at_end()
  {
	  Node temp = root;

	    while(temp != null)
	   {
		  temp = temp.next;
		  
	    }
	  
	   
	  temp = null;
	  
	   
  }
   public void delete_at_first()
   {
	   if(root == null)
		   System.out.println("link List is empty");
	   else
	   {	   
	      
	      Node temp;
	      temp = root;
	      root = root.next;
	      temp.next = root;
	   }
   }
   public void add_at_pos(int pos,int data)
   {
	   Node valPos = new Node(data);
	   Node temp;
	   if(root == null)
	   {
		   System.out.println("List is empty");
	   }
	   else
	   {
		   temp = root;
		   for(int i = 1;i < pos ;i++)
		   {
			   temp = temp.next;
			   
		   }
		 if(temp.next != null)
		 {
		   Node n1 = temp;
		    temp = temp.next;
		    n1.next = valPos;
		    valPos.next = temp;
		 }  
		 else
		 {
			 valPos.next = null;
		 }
	   }
   }
	public static void main(String[] args) {
		

	}

}
