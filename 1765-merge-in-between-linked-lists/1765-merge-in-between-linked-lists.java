class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA = list1;
        for (int i = 0; i < a - 1; i++) {
            prevA = prevA.next;
        }
        ListNode afterB = prevA;
        for (int i = 0; i <= b - a + 1; i++) {
            afterB = afterB.next;
        }
        prevA.next = list2;
        ListNode tailList2 = list2;
        while (tailList2.next != null) {
            tailList2 = tailList2.next;
        }
        tailList2.next = afterB;

        return list1;
    }
}
