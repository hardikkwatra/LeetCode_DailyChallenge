class Solution {
    public void largestValues(TreeNode root, ArrayList<Integer> list, int level) {
        if (root == null) return;
        if (list.size() == level) {
            list.add(root.val);
        }
        else if (root.val > list.get(level)) {
            list.set(level, root.val);
        }
        largestValues (root.left, list, level + 1);
        largestValues (root.right, list, level + 1);
    }
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> list = new ArrayList();
        largestValues (root, list, 0);
        return list;
    }
}