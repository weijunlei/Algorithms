package zimifenzu;

import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/7/19
 */
public class Main {
    public static void main(String[] args){
        ZiMiFenZu ziMiFenZu = new ZiMiFenZu();
        String[] strs = {"ate", "eat", "tea", "nat", "tan", "bat"};
        List<List<String>> result = ziMiFenZu.groupAnagrams(strs);
        for(List<String> lists : result){
            System.out.println(lists.toString());
        }
    }
}
