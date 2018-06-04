package MySort;

public class QuickSort {
    private static void Swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
//        arr[i] = arr[i] + arr[j];
//        arr[j] = arr[i] - arr[j];
//        arr[i] = arr[i] - arr[j];
    }
    private static int Partition(int arr[], int left, int right)
    {
        int pivot = arr[right];
        int pivotIndex = left;
        for (int i = left; i < right; i++)
        {
            if (arr[i] <= pivot)
                Swap(arr, pivotIndex++  , i);
        }
        Swap(arr, pivotIndex , right);

        return pivotIndex;
    }

    public static void QuickSort(int arr[], int left, int right)
    {
        if (left >= right)
            return ;
        int pivotIndex = Partition(arr, left, right);
        QuickSort(arr, left, pivotIndex-1);
        QuickSort(arr, pivotIndex + 1, right);
    }
}
