import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = addTwoNumbers(listNode1, listNode2);
        test(result);
    }

    public static ListNode addTwoNumbers2(ListNode listNode1, ListNode listNode2) {
        ListNode last1 = listNode1;
        ListNode last2 = listNode2;
        ListNode listNode = new ListNode();
        ListNode listNodenext = null;
        int butun = 0;
        while (last1 != null && last2 != null) {
            int val = last1.val + last2.val + butun;
            if (val < 10) {
                listNodenext = listNode.next;
                listNodenext = new ListNode(val);
                butun = 0;
            }else {
                butun = val / 10;
                listNode = new ListNode(val % 10);
            }
            last1 = last1.next;
            last2 = last2.next;
        }
        return listNode;
    }

    public static ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {
        ListNode last1 = listNode1;
        ListNode last2 = listNode2;
        ListNode listNode = null;
        int butun = 0;
        while (last1 != null && last2 != null) {
            int val = last1.val + last2.val + butun;
            if (val < 10) {
                listNode = new ListNode(val, listNode);
                butun = 0;
            }else {
                butun = val / 10;
                listNode = new ListNode(val % 10, listNode);
            }
            last1 = last1.next;
            last2 = last2.next;
        }
        return listNode;
    }

    public static void test(ListNode listNode) {
        System.out.print(listNode.val);
        if (listNode.next != null) {
            test(listNode.next);
        }
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        return null;
//    }
}
