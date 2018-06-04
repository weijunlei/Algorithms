package MySort;

public class MergeSortRecursion {
    public static void mergeSortRecursion(int[] arr, int left, int right)
    {
        if (left == right)
            return;
        int mid = (left + right) / 2;
        mergeSortRecursion(arr, left, mid);
        mergeSortRecursion(arr, mid+1, right);
        Merge.Merge(arr, left, mid, right);
    }
}
