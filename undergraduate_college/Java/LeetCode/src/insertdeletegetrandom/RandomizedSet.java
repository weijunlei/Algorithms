package insertdeletegetrandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 * 插入和删除以及随机获取时间复杂度为1的算法
 */
public class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> list;

    public RandomizedSet(){
        map = new HashMap<Integer, Integer>();
        list = new ArrayList<>();
    }

    /** 以O(1)复杂度插入一个数，插入成功返回true,否则false*/
    public boolean insert(int val){
        if (map.containsKey(val)){
            return false;
        }

        map.put(val, list.size());
        list.add(val);
        return true;
    }

    /** 以O(1)复杂度删除一个数，删除成功返回true，否则false */
    public boolean remove(int val){
        if (!map.containsKey(val)){
            return false;
        }

        int valIndex = map.get(val);
        int lastElement = list.get(list.size() - 1);

        map.put(lastElement, valIndex);
        list.set(valIndex, lastElement);

        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }

    /** 以O(1)复杂度随机返回一个数 */
    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}
