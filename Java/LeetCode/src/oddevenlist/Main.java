package oddevenlist;

/**
 * @author : Qingfeng
 * @date : 2018/8/11
 */
public class Main {
    public static void main(String[] args){
        OddEvenList oddEvenList = new OddEvenList();
        int[] nums = {1, 2, 3, 4, 5};
        ListNode l1 = new ListNode(0);
        ListNode pre = l1;
        for(int i = 0; i < nums.length; i++){
            pre.next = new ListNode(nums[i]);
            pre = pre.next;
        }
        ListNode l2 = oddEvenList.oddEvenList(l1);
        while(l2 != null){
            System.out.println(l2.val);
            l2 = l2.next;
        }
    }
}
