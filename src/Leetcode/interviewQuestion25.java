package Leetcode;

/**
 *面试题25. 合并两个排序的链表
 *输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * 示例1：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 限制：
 * 0 <= 链表长度 <= 1000
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class interviewQuestion25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res =new ListNode(0),next=res;

        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
                next.next=l2;
                next=next.next;
                l2=l2.next;
            }
            else{
                next.next=l1;
                next=next.next;
                l1=l1.next;
            }
        }
        if(l1!=null){
            next.next=l1;
        }
        if(l2!=null){
            next.next=l2;
        }
        return res.next;
    }
}
