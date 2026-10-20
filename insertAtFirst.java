public class insertAtFirst {
    public static void main(String[] args){
    Node head=new Node(10);
    head.next=new Node(30);
    head.next.next=new Node(22);
    Node a=new Node(29);
    a.next=head;
    head=a;
    // print the new 
    Node temp1=head;
    while(temp1!=null){
        System.out.println(temp1.data);
        temp1=temp1.next;
    }

    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
