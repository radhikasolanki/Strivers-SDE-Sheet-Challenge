/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node child;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.child = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.child = null;
     }
     Node(int data, Node next, Node child)
     {
         this.data = data;
         this.next = next;
         this.child = child;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node merge(Node l1, Node l2){
        
        if(l1==null)return l2;
        if(l2==null)return l1;
        Node list=new Node(-1);
        Node temp=list;
        while(l1!=null && l2!=null){
            if(l1.data<=l2.data){
                temp.child=new Node(l1.data);
                l1=l1.child;
                temp=temp.child;
            }
            else{
                temp.child=new Node(l2.data);
                l2=l2.child;
                temp=temp.child;
            }
        } 
        if(l1!=null)temp.child=l1;
        if(l2!=null)temp.child=l2;
        return list.child;
    }
    public static Node flattenLinkedList(Node head) {
        //Write your code here
        // Node curr=head;
        Node list=new Node(-1);
        Node temp=list;
        Node curr=head;
        while(curr!=null){
           temp=merge(temp,curr);
           curr=curr.next;
        }
        return temp.child;
    }
}
