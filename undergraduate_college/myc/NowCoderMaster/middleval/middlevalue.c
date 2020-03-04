#include <stdio.h>

// 交换数组中的两个位置
void swap(int* nums, int a, int b){
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
}

// 获取最左端的在总排序位置
int getSpecialIndex(int* nums, int left, int right){
    int getNum = nums[left];
    int getIndex = left;
    for(int i = left + 1; i <= right; i++){
        if (getNum > nums[i]){
            getIndex++;
            swap(nums, getIndex, i);
        }
    }
    swap(nums, left, getIndex);
    return getIndex;
}

// 获取给定的总排序位置为findIndex的值
int findMiddle(int* nums, int findIndex, int left, int right){
    int getIndex = getSpecialIndex(nums, left, right);
    // printf("%d", getIndex);
    if (getIndex == findIndex){
        return nums[getIndex];
    }
    else if (getIndex > findIndex){
        return findMiddle(nums, findIndex, left, getIndex - 1);
    }
    else{
        return findMiddle(nums, findIndex, getIndex + 1, right);
    }
}

int main(){
    int n;
    while(scanf("%d", &n)){
        int nums[n];
        for(int i = 0; i < n; i++){
            scanf("%d", &nums[i]);
        }
        if (n % 2 == 0){
            int leftNum = n / 2 - 1;
            int rightNum = leftNum + 1;
            leftNum = findMiddle(nums, leftNum, 0, n - 1);
            rightNum = findMiddle(nums, rightNum, rightNum, n - 1);
            printf("%d %d", leftNum, rightNum);
        }
        else{
            int middleNum = (n + 1) / 2 - 1;
            middleNum = findMiddle(nums, middleNum, 0, n - 1);
            printf("%d", middleNum);
        }
    }
}
