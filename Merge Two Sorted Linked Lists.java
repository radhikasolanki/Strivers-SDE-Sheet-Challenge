import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        if(first==null)
        return second;
        if(second==null){
            return first;
        }
        LinkedListNode temp=new LinkedListNode(-1);
        LinkedListNode temp1=temp;
        LinkedListNode list1=first;
        LinkedListNode list2=second;

        while(list1!=null && list2!=null){
            int a=(int)list1.data;
            int b=(int)list2.data;
            if(a<=b){
                temp1.next=new LinkedListNode(a);
                temp1=temp1.next;
                list1=list1.next;
            }
            else{
                temp1.next=new LinkedListNode(b);
                temp1=temp1.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            temp1.next=list1;
        }
        if(list2!=null){
            temp1.next=list2;
        }
        return temp.next;

	}
}
