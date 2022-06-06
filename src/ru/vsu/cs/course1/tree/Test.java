package ru.vsu.cs.course1.tree;

public class Test {
    public static int getMaxLeaveValue(DefaultBinaryTree<Integer> binaryTree) {
        return getMaxLeaveValue(binaryTree.getRoot()).getValue();
    }

    private static DefaultBinaryTree.TreeNode<Integer> getMaxLeaveValue(DefaultBinaryTree.TreeNode<Integer> node) {
        if (node.getRight() != null) {
            return getMaxLeaveValue(node.getRight());
        }
        if (node.getLeft() != null) {
            return getMaxLeaveValue(node.getLeft());
        }

        return node;
    }


}
