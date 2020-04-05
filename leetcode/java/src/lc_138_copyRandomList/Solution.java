package lc_138_copyRandomList;

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }

        Node pre = head;

        while(pre != null){
            Node newNode = new Node(pre.val);
            newNode.next = pre.next;
            pre.next = newNode;
            pre = pre.next.next;
        }

        pre = head;

        while(pre != null){
            if (pre.next != null && pre.random != null){
                pre.next.random = pre.random.next;
            } else {
                pre.next.random = null;
            }
            pre = pre.next.next;
        }

        Node origin = head;
        pre = head.next;
        Node result = head.next;

        while(pre != null){
            origin.next = origin.next.next;
            if (pre.next == null){
                pre.next = null;
            }else{
                pre.next = pre.next.next;
            }
            origin = origin.next;
            pre = pre.next;
        }

        return result;
    }
}
