public class Solution 
{
	public static void inorder(TreeNode<Integer> root, ArrayList<Integer> arr){
		if(root==null){
			return;
		}
		inorder(root.left,arr);
		arr.add(root.data);
		inorder(root.right,arr);
	}

	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
		if(root==null || k==0)return -1;
		ArrayList<Integer> arr=new ArrayList<>();
		inorder(root,arr);
		if(arr.size()<k)return-1;
		return arr.get(k-1);
		
	}

}
