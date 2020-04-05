package lc_341_NestedIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NestedIterator implements Iterator<Integer> {

    Queue<Integer> queue;
    public NestedIterator(List<NestedInteger> nestedList) {
        queue = new LinkedList<Integer>();
        for(NestedInteger node: nestedList){
            DFS(node);
        }
    }

    @Override
    public Integer next() {
        return queue.poll();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    private void DFS(NestedInteger node){
        if (node.isInteger()){
            queue.offer(node.getInteger());
        } else {
            for(NestedInteger sonNode: node.getList()){
                DFS(sonNode);
            }
        }
    }
}

