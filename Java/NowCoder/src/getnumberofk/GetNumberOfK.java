package getnumberofk;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 * 题目描述：统计一个数字在排序数组中出现的次数。
 */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int result = 0;
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] < k) {
                left = mid + 1;
            }
            else if (array[mid] > k) {
                right = mid - 1;
            }
            else {
                for (int i = mid; i >= left; i --){
                    if (array[i] == k) {
                        result += 1;
                    }
                    else{
                        break;
                    }
                }

                for(int i = mid + 1; i <= right; i++){
                    if (array[i] ==  k) {
                        result += 1;
                    }
                    else {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
