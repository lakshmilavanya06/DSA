//time:2 mins
    
 //Definition for a binary tree node.
  public class TreeNode {
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
 
class Search {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return root;
        }else if(root.val==val){
            return root;
        }else if(root.val<val){
            root=root.right;
            return searchBST(root,val);
        }else{
            root=root.left;
            return searchBST(root,val);
        }
    }
}