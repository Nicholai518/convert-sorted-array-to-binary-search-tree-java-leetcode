public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // there are no elements to build into a tree
        if (nums.length == 0) {
            return null;
        }

        // using helper method
        //                           array, start, end
        return constructTreeFromArray(nums, 0, nums.length - 1);
    }

    // helper method
    // array
    // left boundary
    // right boundary
    public TreeNode constructTreeFromArray(int[] nums, int left, int right) {

        // check boundaries
        // we never want the left boundary to be greater than right
        if (left > right) {
            return null;
        }

        // use binary search formula to find mid point
        // left + (right - left) / 2
        int midPoint = left + (right - left) / 2;

        // the first iteration will return the root
        TreeNode node = new TreeNode(nums[midPoint]);

        // set left
        node.left = constructTreeFromArray(nums, left, midPoint - 1);
        // set right
        node.right = constructTreeFromArray(nums, midPoint + 1, right);

        return node;
    }
}
