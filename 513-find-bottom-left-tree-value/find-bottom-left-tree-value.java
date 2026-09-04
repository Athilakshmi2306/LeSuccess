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
import java.util.*;

class Solution {
    public int findBottomLeftValue(TreeNode root) {

        List<TreeNode> list = new ArrayList<>();
        list.add(root);

        while (!list.isEmpty()) {

            int size = list.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = list.remove(0);

                if (i == 0) {
                    root = node;
                }

                if (node.left != null) {
                    list.add(node.left);
                }

                if (node.right != null) {
                    list.add(node.right);
                }
            }
        }

        return root.val;
    }
}