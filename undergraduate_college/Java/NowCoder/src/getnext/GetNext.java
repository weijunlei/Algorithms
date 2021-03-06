package getnext;

/**
 * @author : Qingfeng
 * @date : 2018/7/2
 */
public class GetNext {
    public TreeLinkedNode getNext(TreeLinkedNode pNode){
        if (pNode == null) {
            return pNode;
        }

        // 需要注意中序遍历的非简单结果
        if (pNode.right != null){
            pNode = pNode.right;
            while (pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }

        while(pNode.next != null){
            if (pNode.next.left == pNode){
                return pNode.next;
            }
            pNode = pNode.next;
        }

        return null;
    }
}
