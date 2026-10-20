public class insertAtIDX {
    public static void main(String[] args){
    Node head=new Node(10);
    head.next=new Node(30);
    head.next.next=new Node(22);
    Node a=new Node(29);
    int idx=2;
    // find count first 
    Node temp=head;
    int count=0;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
    if(idx>=count || idx<0){
        System.out.println("invalid");
        return;
    }
    // find previous element 
    Node previous=null;
    Node temp1=head;
    for(int i=0;i<idx-1;i++){
        temp1=temp1.next;
    }
    previous=temp1;
    // find the current
    Node current=null; 
    Node temp2=head;
    for(int i=0;i<idx;i++){
        temp2=temp2.next;
    }
    current=temp2;
    // 
    previous.next=a;
    a.next=current ;
    // print 
    Node temp3=head;
    while(temp3!=null){
        System.out.println(temp3.data);
        temp3=temp3.next;
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
