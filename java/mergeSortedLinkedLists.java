import java.util.ArrayList;
import java.util.Arrays;

public class mergeSortedLinkedLists {

    public static class ListNode {
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

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(3);
        ListNode node13 = new ListNode(4);
        node11.next = node12;
        node12.next = node13;

        mergeTwoLists(node1, node11);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list = new ArrayList<>();
        if (list1 == null && list2 == null) {
            return null;
        }

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list.add(list1.val);
                list1 = list1.next;
            } else if (list2.val < list1.val) {
                list.add(list2.val);
                list2 = list2.next;

            } else {
                list.add(list1.val);
                list.add(list2.val);

                list1 = list1.next;
                list2 = list2.next;
            }

        }

        ListNode remainingNode = list1 == null ? list2 : list1;

        while (remainingNode != null) {
            list.add(remainingNode.val);
            remainingNode = remainingNode.next;
        }

        ListNode head = new ListNode();
        ListNode output = head;

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

            output.val = list.get(i);
            if (i + 1 != list.size()) {
                output.next = new ListNode();

            }
            output = output.next;
        }

        return head;
    }
}
