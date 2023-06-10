import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
	        int data;
	        Node *next;
	        Node(int data)
	        {
		        this->data = data;
		        this->next = NULL;
	        }
        };

*****************************************************************/

public class Solution {
	public static Node fun(Node head, int ind, int[]b){
		if(head==null)return head;
		if(ind>=b.length) return head;
		Node curr=head;
		Node prev=null;
		Node temp=null;
		if(b[ind]==0){
			head=fun(head,ind+1,b);
			return head;
		}
		int c=0;
		while(curr!=null && c<b[ind]){
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
			c++;

		}
		if(temp!=null){
			head.next=fun(temp,ind+1,b);
		}
		return prev;
	}
	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		// Write your code here.
		return fun(head,0,b);
	}
}
