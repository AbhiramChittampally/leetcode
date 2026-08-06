// Last updated: 8/6/2026, 10:34:46 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> al=new ArrayList<>();
            int l=q.size();
            
            
            
            for(int i=0;i<l;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                al.add(q.poll().val);

            }
            
            
            ans.add(al);
        }
        return ans;
        
    }
}