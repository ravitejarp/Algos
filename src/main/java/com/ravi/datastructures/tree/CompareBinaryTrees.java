package com.ravi.datastructures.tree;

public class CompareBinaryTrees {

    public static boolean areTheTreesSame(TreeNode head1, TreeNode head2) {
        if (head1 == null && head2 == null) {
            return true;
        }

        if (head1 == null) {
            return false;
        } else if (head2 == null) {
            return false;
        }

        if (areTheTreesSame(head1.getLeftNode(), head2.getLeftNode()) && areTheTreesSame(head1.getRightNode(), head2.getRightNode())) {
            return head1.getData() == head2.getData();
        }
        return false;

    }

    public static void main(String[] args) {
        TreeNode head1 = new TreeNode(12, null, null);
        TreeNode head2 = new TreeNode(12, null, null);
        TreeNode ch1 = new TreeNode(13, null, null);
        head1.setLeftNode(ch1);
        TreeNode ch12 = new TreeNode(14, null, null);
        head1.setRightNode(ch12);
        TreeNode ch2 = new TreeNode(13, null, null);
        head2.setLeftNode(ch2);
        TreeNode ch21 = new TreeNode(13, null, null);
        head2.setLeftNode(ch1);
//        TreeNode ch1 = new TreeNode(13,null,null);
//        head1.setLeftNode(ch1);
//        TreeNode ch1 = new TreeNode(13,null,null);
//        head1.setLeftNode(ch1);
//        TreeNode ch1 = new TreeNode(13,null,null);
//        head1.setLeftNode(ch1);
//        TreeNode ch1 = new TreeNode(13,null,null);
//        head1.setLeftNode(ch1);
//        TreeNode ch1 = new TreeNode(13,null,null);
//        head1.setLeftNode(ch1);
//        TreeNode ch1 = new TreeNode(13,null,null);
//        head1.setLeftNode(ch1);
//        TreeNode ch1 = new TreeNode(13,null,null);
//        head1.setLeftNode(ch1);
//        TreeNode ch1 = new TreeNode(13,null,null);
//        head1.setLeftNode(ch1);
//        TreeNode ch1 = new TreeNode(13,null,null);
//        head1.setLeftNode(ch1);
    }

    public boolean areTheySame(TreeNode head1, TreeNode head2) {
        if (head1 == null && head2 == null) {
            return true;
        }

        if (head1 == null) {
            return false;
        } else if (head2 == null) {
            return false;
        }

        while (head1 != null && head2 != null) {
            if (head1.getData() != head2.getData()) {
                return false;
            }

        }

        return true;
    }
}
