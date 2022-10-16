public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = new int[]{-10, -5, -3, 0, 5, 8, 9};

        TreeNode root = solution.sortedArrayToBST(nums);

        printNode(root);
    }

    public static void printNode(TreeNode node) {
        System.out.println(node.val);
        if (node.left != null && node.right != null) {
            printNode(node.left);
            printNode(node.right);
        }
    }
}
