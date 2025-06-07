public class removeNthNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int tail = getTail(head);
            int stop = tail - n - 1;
            int count = 0;
            ListNode A = head;

            if (stop < 0) {
                return head = head.next;
            }

            while (count != stop) {
                A = A.next;
                count++;
            }
            A.next = A.next.next;

            return head;
        }

        public int getTail(ListNode head) {
            int count = 1;
            ListNode end = head;
            while (end.next != null) {
                end = end.next;
                count++;
            }
            return count;
        }
    }
}
