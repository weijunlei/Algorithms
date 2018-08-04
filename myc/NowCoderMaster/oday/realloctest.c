#include <stdio.h>
#include <stdlib.h>

void swap(int* num, int m, int n){
    int tempNum = num[m];
    num[m] = num[n];
    num[n] = tempNum;
}

int getPartition(int* num, int left, int right){
    int getIndex = left;
    int getNum = num[left];
    for(int i = left + 1; i <= right; i++){
        if (getNum > num[i]){
            getIndex ++;
            swap(num, getIndex , i);
        }
    }
    swap(num, left, getIndex);
    return getIndex;
}

void quickSort(int* num, int left, int right){
    if (right > left){
        int getIndex = getPartition(num, left, right);
        quickSort(num, left, getIndex - 1);
        quickSort(num, getIndex + 1, right);
    }
}

int main(){
    int* num;
    int count,t;
    count = 0;
    num = (int*)malloc(sizeof(int));
    printf("Please input the numbers end with 0:\n");
    scanf("%d", &t);
    while(t)
    {
        count ++;
        num = (int*)realloc(num, count*sizeof(int));
        num[count-1] = t;
        scanf("%d", &t);
    }

    // quick sort
    quickSort(num, 0, count - 1);
    for(int i = 0; i < count; i++){
        printf("%d ", num[i]);
    }

    return 0;
}
