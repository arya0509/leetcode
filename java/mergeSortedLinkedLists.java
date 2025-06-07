public class mergeSortedLinkedLists {

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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null && list2 == null) {
                return list1;
            }
            if (list1 == null && list2 != null) {
                return list2;
            } else if (list2 == null && list1 != null) {
                return list1;
            }
            ListNode head = list1.val >= list2.val ? list2 : list1;
            ListNode largerNode = list1.val >= list2.val ? list1 : list2;
            ListNode smallerNode = list1.val >= list2.val ? list2 : list1;
            head.next = comp(largerNode, smallerNode.next);

            return head;

        }

        public ListNode comp(ListNode A, ListNode B) {
            if (A == null || B == null) {
                if (A == null) {
                    return B;
                }
                return A;
            }

            ListNode largerNode = A.val >= B.val ? A : B;
            ListNode smallerNode = A.val >= B.val ? B : A;

            smallerNode.next = comp(largerNode, smallerNode.next);
            return smallerNode;

        }

    }

    public static void main(String[] args) {
        mergeSortedLinkedLists msl = new mergeSortedLinkedLists();
        Solution sol = msl.new Solution();

        ListNode ln1 = msl.new ListNode(1);
        ListNode ln2 = msl.new ListNode(2);

        ListNode head = sol.mergeTwoLists(ln1, ln2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
