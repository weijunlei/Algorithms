#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int nums[1000];

void swap(int m, int n){
    int tempNum = nums[m];
    nums[m] = nums[n];
    nums[n] = tempNum;
}

int getPartition(int left, int right){
    srand((unsigned)time(NULL));
    int getRandomInt = rand() % (right - left) + left;
    swap(left, getRandomInt);
    int getIndex = left;
    int getNum = nums[left];
    for(int i = left + 1; i <= right; i++){
        if (nums[i] < getNum){
            getIndex++;
            swap(getIndex, i);
        }
    }
    swap(getIndex, left);
    return getIndex;
}

void quickSort(int left, int right){
    if (right > left){
        int getIndex = getPartition(left, right);
        quickSort(left, getIndex - 1);
        quickSort(getIndex + 1, right);
    }
}

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        int numSize = 0;
        int tempNum = -1;
        for(int i = 0; i < n; i++){
            scanf("%d", &tempNum);
            nums[numSize++] = tempNum;
        }
        quickSort(0, numSize - 1);
        printf("%d\n", nums[numSize - 1]);
        for(int i = 0; i < numSize - 1; i++){
            if (i != numSize - 2)
                printf("%d ", nums[i]);
            else
                printf("%d\n", nums[i]);
        }
        if (numSize == 1){
            printf("-1\n");
        }
    }

    return 0;
}
