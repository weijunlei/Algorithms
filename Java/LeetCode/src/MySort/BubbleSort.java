package MySort;

public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        if (arr == null || arr.length == 0)
            return;

        for (int i=0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
    }
}
