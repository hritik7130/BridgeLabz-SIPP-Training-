package Arrays;
import java.util.*;
class Node{
  int data ;
  Node next;

  Node(int data){
    this.data=data;
    this.next=null;
  }
}
public class SinglyLinkedList{
 static Node head;
  public void insertAtend(int data){
    
    Node node =new Node(data);
    if(head==null){
      head =node;


    }
    else{
      Node temp =head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=node;
    }
  
    

  }
  public void display(Node head){
    if(head==null){
      System.out.println("List is empty");
      return;
    }
    else {
      Node temp=head;
      while(temp!=null){
        System.out.print(temp.data + "->");
        temp=temp.next;
      }
      System.out.println("null");
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    SinglyLinkedList l1=new SinglyLinkedList();
    System.out.println("Enter the number of linked list user wants to add");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      
      System.out.println("Enter the data of linked list");
      int data=sc.nextInt();
      l1.insertAtend(data);
    }
    l1.display(head);
   
   
  }
   
  
}