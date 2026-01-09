public class maxDepth {
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

    public static int sol(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return returnMax(root, 1);
    }

    public static int returnMax(TreeNode root, int currMax) {
        if (root == null) {
            return currMax;
        }
        currMax++;
        int leftMax = returnMax(root.left, currMax);
        int rightMax = returnMax(root.right, currMax);

        return leftMax > rightMax ? leftMax : rightMax;

    }
}
