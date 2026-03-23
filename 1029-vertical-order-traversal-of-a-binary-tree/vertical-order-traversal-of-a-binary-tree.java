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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<NodeInfo> q = new LinkedList<>();
        q.offer(new NodeInfo(root, 0, 0));
        while (!q.isEmpty()) {
            NodeInfo curr = q.poll();
            TreeNode node = curr.node;
            int row = curr.row;
            int col = curr.col;
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).offer(node.val);
            if (node.left != null)
                q.offer(new NodeInfo(node.left, row + 1, col - 1));
            if (node.right != null)
                q.offer(new NodeInfo(node.right, row + 1, col + 1));
        }
        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> list = new ArrayList<>();
            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }
            result.add(list);
        }

        return result;
    }
}
class NodeInfo {
    TreeNode node;
    int row, col;

    NodeInfo(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
