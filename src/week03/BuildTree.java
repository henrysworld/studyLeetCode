package week03;

public class BuildTree {

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode node = buildTree(preorder, inorder);
//        System.out.println();
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder){
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public static TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end){
        if (p_start == p_end) return null;

        int root_val = preorder[p_start];
        TreeNode root = new TreeNode(root_val);

        int i_root_index = 0;
        for (int i = i_start; i < i_end; i++){
            if (root_val == inorder[i]){
                i_root_index = i;
                break;
            }
        }

        int leftNum = i_root_index - i_start;

        root.left = buildTreeHelper(preorder, p_start + 1, p_start + leftNum + 1, inorder, i_start, i_root_index);

        root.right = buildTreeHelper(preorder, p_start + leftNum + 1, p_end, inorder, i_root_index + 1, i_end);

        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}

