## [109. Convert Sorted List to Binary Search Tree](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/)

문제 풀이법
AVL 




if(head==null)
return null;
if(head.next==null)
return new TreeNode(head.val);
ListNode slow=head;
ListNode fast=head.next.next;


        TreeNode res=new TreeNode(slow.next.val);
        ListNode righthalf=slow.next.next;
        slow.next=null;
        res.left=sortedListToBST(head);
        res.right=sortedListToBST(righthalf);
        return res;