package MySort;

public class InsertSort {
    public static void insertSort(int[] arr)
    {
        for (int i=1; i < arr.length; i++)
        {
            int curInt = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > curInt;)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curInt;
        }
    }
}
