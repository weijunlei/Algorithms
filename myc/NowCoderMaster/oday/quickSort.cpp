#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void swap(int* nums, int m, int n){
    int temp = nums[m];
    nums[m] = nums[n];
    nums[n] = temp;
}

int getPartition(int* nums, int left, int right){
    srand((unsigned)time(NULL));
    int randInt = rand() % (left - right) + left;
    swap(nums, randInt, left);
    int getNum = nums[left];
    int getIndex = left;
    for(int i = left + 1; i <= right; i++){
        if (getNum > nums[i]){
            getIndex++;
            swap(nums, getIndex, i);
        }
    }
    swap(nums, getIndex, left);
    return getIndex;
}

void quickSort(int* nums, int left, int right){
    if (right > left){
        int getIndex = getPartition(nums, left, right);
        quickSort(nums, left, getIndex - 1);
        quickSort(nums, getIndex + 1, right);
    }
}

int main(){
    int nums[10] = {3,2,1,4,5,6,9,8,7, 0};
    quickSort(nums, 0, 9);
    for(int i = 0; i < 10; i ++){
        printf("%d\t", nums[i]);
    }
    return 0;
}
