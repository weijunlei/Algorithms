#include <stdio.h>
#include <stdlib.h>
#include <time.h> //使用作为时间种子

void swap(int *nums, int m, int n){
    int temp = nums[m];
    nums[m] = nums[n];
    nums[n] = temp;
}

void bubbleSort(int *nums, int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n - i - 1; j++){
            if (nums[j] > nums[j + 1]){
                swap(nums, j, j+1);
            }
        }
    }
}

int getPartition(int *nums, int left, int right){
    srand((unsigned)time(NULL));
    int changeIndex = rand() % (right - left) + left;
    swap(nums, changeIndex, left);
    int getNum = nums[left];
    int getIndex = left;
    for(int i = left + 1; i <= right; i++){
        if (nums[i] < getNum){
            getIndex++;
            swap(nums, getIndex, i);
        }
    }
    swap(nums, getIndex, left);
    return getIndex;
}

void quickSort(int* nums, int left, int right){
    if (right > left){
        int posIndex = getPartition(nums, left, right);
        quickSort(nums, left, posIndex - 1);
        quickSort(nums, posIndex + 1, right);
    }
}

int main(){
    int n = 0;
    while(scanf("%d", &n)){
        int nums[n];
        for(int i = 0; i < n; i++){
            scanf("%d", &nums[i]);
        }
        //bubbleSort(nums, n);
        quickSort(nums, 0, n - 1);
        for(int i = 0; i < n; i ++){
            printf("%d ", nums[i]);
        }
        printf("\n");
    }
}
