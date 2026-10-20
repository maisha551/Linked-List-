class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class nthLast {
    public static void main(String[] args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        //  last nth node from first=count-nth+1
        // nth node from last 
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("count:"+ " "+count);
        int n=2;
        Node temp1=head;
        int nthFromFirst=count-n;
        for(int i=0;i<nthFromFirst;i++){
            temp1=temp1.next;
        }
        System.out.println(temp1.data);
    }
}
