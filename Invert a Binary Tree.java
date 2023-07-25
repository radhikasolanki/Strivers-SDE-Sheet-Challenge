public class Solution 
{
    public static TreeNode<Integer> invertBinaryTree(TreeNode<Integer> root, TreeNode<Integer> leaf) {
        // Write your code here.
        if(root==null)
            return null;
        Stack<TreeNode<Integer>> st = new Stack<>();
        boolean f = helper(root,leaf,st);
        
        TreeNode<Integer> new_root = st.peek();
        st.pop();
        TreeNode<Integer> par = new_root;
        while(!st.isEmpty()){
            int cur = st.peek();
            st.pop();
            if(cur.left==par){
                cur.left = null;
                par.left = cur;
            }
            else{
                cur.right = cur.left;
                cur.left = null;
                par.left = cur;
            }
            par = cur;
        }
        return new_root;
        
    }
  static boolean helper(TreeNode<Integer> root, TreeNode<Integer>leaf, stack<TreeNode<Integer>> st){  
    TreeNode<Integer> res = new TreeNode<Integer>();
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add()
      }
}
