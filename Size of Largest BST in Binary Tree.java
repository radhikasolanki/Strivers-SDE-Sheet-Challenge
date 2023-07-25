public class Solution {

	static class Node{
		public int size;
		public int min;
		public int max;	
		public Node(int size, int minValue, int maxValue){
			this.size = size;
			this.min = minValue;
			this.max = maxValue;
		}
	
	}

	public static int largestBST(TreeNode<Integer> root) {

		return compute(root).size;

	}
	
	public static Node compute(TreeNode<Integer> node){
		
		if(node == null) {
			return new Node(0,Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		
		Node left = compute(node.left);
		Node right = compute(node.right);

		if(node.data >= left.max && node.data <= right.min){
			return new Node(
				left.size + right.size + 1,
				Math.min(left.min,node.data),
				Math.max(node.data, right.max)
			);
		}
		return new Node(
			Math.max(left.size, right.size),
			Integer.MIN_VALUE,
			Integer.MAX_VALUE
		);
	}

}
