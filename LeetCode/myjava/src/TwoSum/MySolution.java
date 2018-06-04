package TwoSum;

import java.util.Arrays;

public class MySolution {

    //辅助节点类
    private static class Node implements Comparable<Node> {
        int value;
        int index;

        public Node() {
        }

        public Node(int val, int idx) {
            value = val;
            index = idx;
        }

        public int compareTo(Node other) {
            if (other == null)
                return -1;
            return value - other.value;
        }
    }


    public int[] twoSum(int[] nums, int target) {
        // 结果保存
        int[] result = {0, 0};

        Node[] tmp = new Node[nums.length];
        for (int i = 0; i < nums.length; i++)
            tmp[i] = new Node(nums[i], i);

        Arrays.sort(tmp);

        int left_index = 0;
        int right_index = nums.length - 1;

        while (left_index < right_index) {
            if (tmp[left_index].value + tmp[right_index].value == target) {
                if (tmp[left_index].index < tmp[right_index].index){
                    result[0] = tmp[left_index].index;
                    result[1] = tmp[right_index].index;
                }
                else{
                    result[0] = tmp[right_index].index;
                    result[1] = tmp[left_index].index;
                }
                break;
            }
            else if (tmp[left_index].value + tmp[right_index].value > target) {
                right_index --;
            }
            else
            {
                left_index ++;
            }
        }
        return result;
    }

}
