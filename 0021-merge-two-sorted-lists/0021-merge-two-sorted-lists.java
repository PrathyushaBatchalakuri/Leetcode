/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode finalList = new ListNode(0);

        if(list2 == null){ return list1; }

        if(list1 == null){ return list2; }

        if(list1 == null && list2 == null){
            return null;
        }

        ListNode finalHead;
        if (list1.val <= list2.val) {
            finalHead = list1;
            list1 = list1.next;
        } else {
            finalHead = list2;
            list2 = list2.next;
        }

        ListNode current = finalHead;

        while(list1 != null && list2 != null){
            
            
            if (list1.val <= list2.val) {
                current.next = list1; // Attach smaller node
                list1 = list1.next;   // Move to next node
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // Move current forward
        

        }

        if(list1 != null){
            current.next = list1;
        }
        else{
            current.next = list2;
        }
        
        return finalHead;

    }
}