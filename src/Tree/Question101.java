package Tree;

public class Question101 {

    // Definition for a binary tree node.
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

    public class Solution {
        public boolean isSymmetric(TreeNode root) {
            return checkSymmetric(root.left, root.right);
        }

        public boolean checkSymmetric(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 == null) return true;
            if (root1 == null || root2 == null) return false;
            if (root1.val != root2.val) return false;

            boolean b1 = checkSymmetric(root1.left, root2.right);
            boolean b2 = checkSymmetric(root1.right, root2.left);
            return b1 && b2;
        }
    }

    // Add this to run the code
    public static void main(String[] args) {
        Question101 outer = new Question101();
        Solution sol = outer.new Solution();

        // Example symmetric tree: [1,2,2,3,4,4,3]
        TreeNode root = outer.new TreeNode(1);
        root.left = outer.new TreeNode(2);
        root.right = outer.new TreeNode(2);
        root.left.left = outer.new TreeNode(3);
        root.left.right = outer.new TreeNode(4);
        root.right.left = outer.new TreeNode(4);
        root.right.right = outer.new TreeNode(3);

        boolean result = sol.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + result);
    }
}
