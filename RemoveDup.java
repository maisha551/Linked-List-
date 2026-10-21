class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class  duplicate{
    public static void main(String[] args){
        
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(20);
        Node temp=head;
        while(temp!=null){
            Node temp2=temp;
            while(temp2.next!=null){
                if(temp.data==temp2.next.data){
                    temp2.next=temp2.next.next;
                }
                else{
                temp2=temp2.next;
                }
            }
            temp=temp.next;
        }
        Node temp3=head;
        while(temp3!=null){
            System.out.println(temp3.data);
            temp3=temp3.next;
        }
}
}
