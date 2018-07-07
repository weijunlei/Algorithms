#include <stdio.h>

void swap(int* nums, int a, int b){
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
}

int getPartitionIndex(int* nums, int left, int right){
    int getNum = left;
    int getIndex = left;
    for(int i = left + 1; i <= right; i++){
        if (getNum < nums[i]){
            getIndex ++;
            swap(nums, getIndex, i);
        }
    }
    swap(nums, getIndex, left);
    return getIndex;
}

void printMofN(int* nums, int m, int left, int right){
    int getIndex = getPartitionIndex(nums, left, right);
    if (getIndex == m - 1){
        return;
    }
    else if (getIndex < m - 1){
        printMofN(nums, m, getIndex+1, right);
    }
    else{
        printMofN(nums, m, left, getIndex - 1);
    }
}

int main(){
    int n = 0;
    int m = 0;
    if (scanf("%d %d", &n, &m)){
        int nums[n];
        for(int i = 0; i < n; i++){
            scanf("%d", &nums[i]);
        }
        printMofN(nums, m, 0, n - 1);
        for(int i = 0; i < m; i++){
            printf("%d\t", nums[i]);
        }
        printf("\n");
    }
    return 0;
}
