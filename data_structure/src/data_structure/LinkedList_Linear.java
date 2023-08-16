package data_structure;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author 
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author amart
 */
 import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}

public class LinkedList_Linear 
{
    Node root;
    void createList()
    {
        root=null;
    }
    
    void insertLeft(int e)
    {
       Node n=new Node(e);//node created 
       if(root==null)//no root
           root=n;
       else
       {
        n.next=root;//1
        root=n;
       }
    }
    void deleteLeft()
    {
       if(root==null)//no root
           System.out.println("Empty List");
       else
       {
        
        Node t=root;//1
        root=root.next;//2
        System.out.println("Deleted:"+t.data);   
       }
    }
    
    void insertRight(int e)
    {
       Node n=new Node(e);//node created 
       if(root==null)//no root
           root=n;
       else
       {
        Node t=root;//1
        while(t.next!=null)//2
            t=t.next;
        t.next=n;
       
       }
    }
    void deleteRight()
    {
       if(root==null)//no root
           System.out.println("Empty List");
       else
       {
        Node t=root;//1
        Node t2=t;
        while(t.next!=null)//2
        {
            t2=t;
            t=t.next;
        }
        if(t==root)//single node
            root=null;
        else
            t2.next=null;//3
        System.out.println("Deleted:"+t.data);   
       }
    }
    
    void printList()
    {
       if(root==null)//no root
           System.out.println("Empty List");
       else
       {
           Node t=root;
           while(t!=null)
           {
               System.out.print("|"+t.data+"-->");
               t=t.next;
           }
       }
    }
    void searchList(int key)
    {
       if(root==null)//no root
          System.out.println("Empty List");         
       else
       {
           Node t=root;
           while(t!=null && t.data!=key)
           {
            t=t.next;
           }
           if(t==null)
               System.out.println(key+" Not found");
           else
               System.out.println(key+" found");
       }
    }
    void deleteKey(int key)
    {
       if(root==null)//no root
          System.out.println("Empty List");         
       else
       {
           Node t=root;
           Node t2=t;
           while(t!=null && t.data!=key)
           {
            t2=t;
            t=t.next;
           }
           if(t==null)
               System.out.println(key+" Not found");
           else
           {
               System.out.println(key+" found");
               if(t==root)
               {
                   root=root.next;
               }
               else if(t.next==null)
               {
                   t2.next=null;
               }
               else
               {
                   t2.next=t.next;
               }
                   
               System.out.println("Deleted:"+t.data);
           }
               
       }
    }
    void insertAt(int index,int e)
    {
       Node n=new Node(e);//node created 
       if(root==null)//no root
           root=n;
       else
       {
        Node t,t2;
        t=t2=root;
        if(index==0)
        {
            n.next=root;
            root=n;
        }
        else
        {
            while(index>0)
            {
                t2=t;
                t=t.next;
                index--;
            }
            t2.next=n;//1
            n.next=t;//2
        }
        
       }
       System.out.println("Inserted:");
    }
    
    public static void main(String args[])
    {
    int choice;
   LinkedList_Linear  obj=new LinkedList_Linear();
   Scanner in=new Scanner(System.in);

   obj.createList();
   do
        {
            int e;
            System.out.print("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Search data\n6.Print List\n7.Delete on key:\n8.Insert at\n0.Exit:");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                        System.out.println("Enter element:");
                        e=in.nextInt();
                        obj.insertLeft(e);
                        break;
                       
                case 2:
                        System.out.println("Enter element:");
                        e=in.nextInt();
                        obj.insertRight(e);
                        break;
                case 3:
                       obj.deleteLeft();
                       break;
                case 4:
                       obj.deleteRight();
                       break;
                case 5:
                        System.out.println("Enter element:");
                        e=in.nextInt();
                        obj.searchList(e);
                        break;
                case 6:
                        obj.printList();
                        break;
                case 7:
                        System.out.println("Enter element to delete:");
                        e=in.nextInt();
                        obj.deleteKey(e);
                        break;
                case 8:
                        System.out.println("Enter element to insert:");
                        e=in.nextInt();
                        System.out.println("Enter index:");
                        int i=in.nextInt();
                        obj.insertAt(i,e);
                        break;  
                    
                default:
                       System.out.print("Wrong input:");
                       break;
            }
        }while(choice!=0);

}
}


