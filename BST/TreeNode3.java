
public class TreeNode3 {

 // Definition for a binary tree node.

      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public int kthSmallest(TreeNode root, int k) {
    Stack <TreeNode> s =new Stack<>();
    TreeNode c=root;
    while(c!=null||!s.isEmpty()){
        while(c!=null){
            s.push(c);
            c=c.left;
    }
         c=s.pop();
         k--;
    if(k==0)return c.val;
    c=c.right;
    }
    return -1;
    }
}
