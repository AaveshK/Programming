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
class Solution
{
    public ListNode[] splitListToParts(ListNode head, int k)
    {
        ListNode[] ret = new ListNode[k];
        ListNode temp = head;
        int length = 0;
        while(temp != null)
        {
            length ++;
            temp = temp.next;
        }
        int size = length / k;
        int extra = length % k;
        int p = 0;
        temp = head;
        while(temp != null)
        {
            ret[p++] = temp;
            int tot = size;
            if(extra > 0)
                tot++;
            int count = 0;
            while(count < tot - 1)
            {
                temp = temp.next;
                count++;
            }
            ListNode temp2 = temp;
            temp = temp.next;
            temp2.next = null;
            extra --;
        }
        return ret;
    }
}