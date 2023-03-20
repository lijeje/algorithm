package Main.leetcode;

public class FindaCorrespondingNodeofaBinaryTreeInaCloneofThatTree_1379 {
    //https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/

//
//    class Solution {
//
//        TreeNode target,res;
//        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
//            this.target = target;
//            inorder(original,cloned);
//            return res;
//        }
//
//        public void inorder(final TreeNode original, final TreeNode cloned){
//            if(original != null){
//                inorder(original.left, cloned.left);
//                if(original == target) res = cloned;
//                inorder(original.right, cloned.right);
//            }
//        }
//    }
}
