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
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public List<TreeNode> generateTrees(int n) {
        return generateBSTs(1, n);
    }

    private List<TreeNode> generateBSTs(int start, int end) {
        List<TreeNode> allBSTs = new ArrayList<>();

        if (start > end) {
            allBSTs.add(null);
            return allBSTs;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftSubtrees = generateBSTs(start, i - 1);
            List<TreeNode> rightSubtrees = generateBSTs(i + 1, end);

            for (TreeNode leftSubtree : leftSubtrees) {
                for (TreeNode rightSubtree : rightSubtrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftSubtree;
                    root.right = rightSubtree;
                    allBSTs.add(root);
                }
            }
        }

        return allBSTs;
    }

    // Helper method to print a BST (in-order traversal)
    private void printBST(TreeNode root) {
        if (root != null) {
            printBST(root.left);
            System.out.print(root.val + " ");
            printBST(root.right);
        }
    }
}