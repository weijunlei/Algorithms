package MySort;

public class MySortTest {
    public static void main(String[] args)
    {
        int[] arr = {23,2,4,56,89,11,1,6,7,3,9,5};
//        InsertSort.insertSort(arr);
//        MergeSortRecursion.mergeSortRecursion(arr, 0, arr.length - 1);
//        HeapSort.HeapSort(arr);
        QuickSort.QuickSort(arr, 0, arr.length - 1);
        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
