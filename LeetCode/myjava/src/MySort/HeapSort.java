package MySort;

public class HeapSort {
    private static void Heapify(int[] arr, int i , int heapSize)
    {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int max = i;
        if (leftChild < heapSize && arr[leftChild] > arr[max])
            max = leftChild;
        if (rightChild < heapSize && arr[rightChild] > arr[max])
            max = rightChild;
        if (max != i)
        {
            arr[i] = arr[i] + arr[max];
            arr[max] = arr[i] - arr[max];
            arr[i] = arr[i] - arr[max];
            Heapify(arr, max, heapSize);
        }
    }

    private static int BuildHeap(int arr[])
    {
        int heapSize = arr.length;
        for (int i = arr.length/2 -1; i >= 0; i--)
            Heapify(arr, i, heapSize);
        return heapSize;
    }

    public static void HeapSort(int[] arr)
    {
        int heapSize = BuildHeap(arr);
        while (heapSize > 1)
        {
            arr[0] += arr[heapSize - 1];
            arr[heapSize - 1] = arr[0] - arr[heapSize - 1];
            arr[0] = arr[0] - arr[heapSize - 1];
            heapSize --;
            Heapify(arr, 0 , heapSize);
        }
    }
}
