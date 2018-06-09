package randomlistnodecopy;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */

public class RandomListNodeCopy {
    public RandomListNode randomListNodeCopy(RandomListNode root) {
        if (root == null) {
            return root;
        }

        RandomListNode result = new RandomListNode(root.val);
        RandomListNode pre = root;
        RandomListNode resultPre = result;

        return result;


    }
}
