#include <stdio.h>

void minHeap(int* nums, int length, int i){// 保持最小堆结构
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int largest = i;
    if (left < length && nums[left] < nums[i]){
        largest = left;
    }
    if (right < length && nums[right] < nums[largest]){
        largest = right;
    }
    if (largest != i){
        int temp = nums[i];
        nums[i] = nums[largest];
        nums[largest] = temp;
        minHeap(nums, length, largest);
    }
}

void buildMinHeap(int *nums, int length){ // 建立最小堆
    int halfLength = (int)length / 2 - 1;
    for(int i = halfLength; i >= 0; i--){
        minHeap(nums, length, i);
    }
}

int getNum(int* nums, int& length, int& isTwo){// 根据获取的顺序决定堆的长度
    int topNum = nums[0];
    if (isTwo == 0){
        nums[0] = nums[length - 1];
        nums[length - 1] = topNum;
        length --;
        isTwo = 1;
        minHeap(nums,length,0);
    }
    else{
        nums[0] = nums[0] + nums[length];
        isTwo = 0;
        minHeap(nums, length, 0);
    }
    return topNum;
}

int main(){
    int n;
    while(scanf("%d", &n)){
        int nums[n];
        int numLength = n;
        int minHFM = 0;
        for(int i = 0; i < n; i++){
            scanf("%d", &nums[i]);
        }
        buildMinHeap(nums, numLength);
        int isTwo = 0;
        if (numLength == 1){
            minHFM = nums[0];
        }
        while(numLength > 1){
            int a = getNum(nums, numLength, isTwo);
            int b = getNum(nums, numLength, isTwo);
            minHFM += a + b;
        }
        printf("%d\n", minHFM);
    }
    return 0;
}
