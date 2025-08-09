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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int[] nums = new int[count];
        temp = head;
        for(int i=count-1;i>=0;i--){
            
            nums[i] = temp.val;
            temp = temp.next;
        }
        int index=0;
        int[] res = new int[count-1];
        for(int i=0;i<count;i++){
            if(i != (n-1)){
            res[index++] = nums[i];
            }
        }
      //  System.out.println(Arrays.toString(res));
      if(res.length == 0) return null;
      if(res.length == 1) return new ListNode(res[0]);
      ListNode ans = new ListNode(res[res.length-1]);
      ListNode s = ans;
      for(int i=res.length - 2;i>=0;i--){
        ans.next = new ListNode(res[i]);
        ans = ans.next;
      }
        return s;
    }
}