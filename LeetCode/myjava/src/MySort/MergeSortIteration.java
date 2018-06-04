package MySort;

public class MergeSortIteration {
    public void mergeSortIteration(int[] arr)
    {
        int left, mid, right;
        for (int i = 1; i < arr.length; i *= 2)
        {
            left = 0;
            while (left + i < arr.length)
            {
                mid = left + i -1;
                right = mid + i < arr.length ? mid + i : arr.length - 1;
                Merge.Merge(arr, left , mid , right);
                left = right + 1;
            }
        }
    }
}
