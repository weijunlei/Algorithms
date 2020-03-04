#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int nums[100];

void swap(int m, int n){
    int tempNum = nums[m];
    nums[m] = nums[n];
    nums[n] = tempNum;
}

int getPartition(int left, int right){
    srand((unsigned)time(NULL));
    int randomInt = rand() % (right - left) + left;
    swap(randomInt, left);
    int getIndex = left;
    int getNum = nums[left];

    for(int i = left + 1; i <= right; i ++){
        if (getNum > nums[i]){
            getIndex ++;
            swap(i, getIndex);
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
        for(int i = 0; i < n; i++){
            scanf("%d", &nums[i]);
        }
        quickSort(0, n - 1);
        for(int i = 0; i < n; i++){
            if (i != n -1)
                printf("%d ", nums[i]);
            else{
                printf("%d\n", nums[i]);
            }
        }
    }

    return 0;
}
