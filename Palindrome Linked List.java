import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode reverse(LinkedListNode head){
		LinkedListNode curr=head;
		LinkedListNode prev=null;
		LinkedListNode temp=null;
		while(curr!=null){
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
		LinkedListNode slow=head;
		LinkedListNode fast=head;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		

		LinkedListNode a1=head;
		LinkedListNode a2=reverse(slow);

		while(a2!=null){
			if(!a1.data.equals(a2.data))return false;
			a1=a1.next;
			a2=a2.next;
		}
		return true;

		
	}
}
