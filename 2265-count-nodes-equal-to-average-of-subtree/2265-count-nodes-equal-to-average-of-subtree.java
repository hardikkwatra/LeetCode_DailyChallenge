class Solution {
    private int count;

    public int averageOfSubtree(TreeNode root) {
        count = 0;
        process(root);
        return count;   
    }

    public int[] process(TreeNode node) {
        if (node == null) return new int[2];
        int[] prev = process(node.left);
        int[] next = process(node.right);
        int subCount = prev[0] + next[0] + 1;
        int subSum = prev[1] + next[1] + node.val;
        if (subSum / subCount == node.val) {
            count++;
        }
        prev[0] += next[0] + 1;
        prev[1] += next[1] + node.val;
        return prev;
    }
}