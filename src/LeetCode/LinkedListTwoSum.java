package LeetCode;

/**
 * Created by prasad223 on 1/2/16.
 */


public class LinkedListTwoSum {
   static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode res = null, cur =null;
        int carry = 0, sum;

        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
            carry = sum/10;
            sum = sum % 10;
            if(res == null){
                res = new ListNode(sum);
                res.next = null;
                cur = res;
            }else{
                cur.next = new ListNode(sum);
                cur = cur.next ;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 == null){
            while(l2 != null){
                if(carry != 0){
                    sum = l2.val + carry;
                    carry = sum / 10;
                    sum = sum % 10;
                }else{
                    sum = l2.val;
                }
                cur.next = new ListNode(sum);
                cur = cur.next;
                l2 = l2.next;
            }
        }else if(l2 == null){
            while(l1 != null){
                if(carry != 0){
                    sum = l1.val + carry;
                    carry = sum / 10;
                    sum = sum % 10;
                }else{
                    sum = l1.val;
                }
                cur.next = new ListNode(sum);
                cur = cur.next;
                l1 = l1.next;
            }
        }
        if(carry != 0){
            cur.next = new ListNode(carry % 10);
            if(carry > 9){
                 cur.next.next = new ListNode(carry / 10);
            }
        }
        return  res;
    }

    public static void main(String[] args){
        ListNode h1 = new ListNode(5);
        //h1.next = new ListNode(8);
        //h1.next.next = new ListNode(3);
        ListNode h2 = new ListNode(5);
        //h2.next = new ListNode(9);
        //h2.next.next = new ListNode(4);
        ListNode res = addTwoNumbers(h1, h2);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
