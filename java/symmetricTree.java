import java.util.ArrayList;

public class symmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean sol(TreeNode root) {
        return verifySymmetry(root.left, root.right);
    }

    public boolean verifySymmetry(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            if (left == right) {
                return true;
            }
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        boolean inOrder = verifySymmetry(left.left, right.right);
        boolean outOrder = verifySymmetry(left.right, right.left);

        return inOrder && outOrder;

    }
}
