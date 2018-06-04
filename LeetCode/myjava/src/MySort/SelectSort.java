package MySort;

public class SelectSort {
    public static void selectSort(int[] arr){
        if (arr == null || arr.length==0)
            return ;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int temp = arr[i];
            minIndex = i;
            for(int j=i+1; j < arr.length; j++)
                if (arr[j] < temp)
                {
                    temp = arr[j];
                    minIndex = j;
                }
            if (minIndex != i)
            {
                arr[i] = arr[i] + arr[minIndex];
                arr[minIndex] = arr[i] - arr[minIndex];
                arr[i] = arr[i] - arr[minIndex];
            }
        }
    }
}
