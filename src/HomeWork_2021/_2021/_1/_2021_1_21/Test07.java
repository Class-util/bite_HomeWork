package HomeWork_2021._2021._1._2021_1_21;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 26
 * Time:14:55
 */

class TreeNode {
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

public class Test07 {
    public static void main(String[] args) {

    }
    TreeNode ret;
    public TreeNode increasingBST(TreeNode root) {
        ret = new TreeNode(0);
        TreeNode tree = ret;
        func(root);
        return tree.right;
    }
    public void func(TreeNode root){
        if(root == null){
            return ;
        }
        func(root.left);
        TreeNode node = new TreeNode(root.val);
        ret.right = node;
        ret = node;
        func(root.right);
    }
}
