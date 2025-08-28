package Arrays;
class Node {
    int data ;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;

    }
}
public class SinglyLinkedList {
    public static void main(String[] args) {
        Node n1=new Node(5);
        Node n2= new Node(6);
        System.out.println(n1.data);
    }
    
}
