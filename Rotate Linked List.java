/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if(k==0 ||head==null || head.next==null)return head;
        int size=0;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        k=k%size;

        if(k==0){
            return head;
        }
        int s=size-k-1;
        curr=head;
        while(s--!=0 && curr!=null){
            curr=curr.next;
        }
        Node temp=curr.next;
        curr.next=null;
        Node a=temp;
        while(a!=null && a.next!=null){
            a=a.next;
        }
        if(a!=null)
          a.next=head;
        return temp;
    }
}
