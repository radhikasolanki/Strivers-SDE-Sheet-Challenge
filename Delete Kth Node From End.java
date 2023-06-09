public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        if(K==0 || head==null )return head;
        int size=0;
        Node curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        if(size==K){
            return head.next;
        }
        int s=size-K-1;
        curr=head;
        while(s--!=0){
          curr=curr.next;
        }
        
       
        curr.next=curr.next.next;
        return head;

    }
}
// 1 2 3 4 5 6 7  k=3
// size=7;
// s=4->3->2->15



