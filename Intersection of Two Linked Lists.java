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
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        Node f=firstHead;
        Node s=secondHead;
        if(firstHead==null || secondHead==null)return -1;

        if(f==s)return f.data;

        while(f!=s){
            f= f==null?secondHead:f.next;
            s=s==null?firstHead:s.next;
        }
        if(f==null)return -1;
        return f.data;

    }
}
