package ZMinNumberInRatateArray;

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array == null)
            return 0;
        int low = 0;
        int high = array.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if (array[mid] > array[high])
                low = mid + 1;
            else if (array[mid] == high)
                high--;
            else
                high = mid;
        }
        return array[low];
    }
}
