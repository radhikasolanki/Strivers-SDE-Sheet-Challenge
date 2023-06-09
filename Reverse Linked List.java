import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode pre=null;
		LinkedListNode temp=null;
		LinkedListNode curr=head;
		while(curr!=null){
			temp=curr.next;
			curr.next=pre;
			pre=curr;
			curr=temp;
		}
		return pre;
    }
}
