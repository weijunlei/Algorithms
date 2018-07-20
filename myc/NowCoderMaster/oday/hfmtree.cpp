#include <stdio.h>

int nums[1000];


void swap(int m, int n){
    int temp = nums[m];
    nums[m] = nums[n];
    nums[n] = temp;
}

void minHeap(int index, int length){
    int left = 2 * index + 1;
    int right = 2 * index + 2;
    int smallest = index;
    if (left < length && nums[left] < nums[index]){
        smallest = left;
    }
    if (right < length && nums[right] < nums[smallest]){
        smallest = right;
    }
    if (smallest != index){
        swap(index, smallest);
        minHeap(smallest, length);
    }
}

void buildHeap(int length){
    int halfLength = length / 2;
    for(int i = halfLength; i >= 0; i--){
        minHeap(i, length);
    }
}

int getHFM(int& length, int& isTwo, int addNum){
    int getNum = nums[0];
    if(isTwo == 0){
        nums[0] = nums[length - 1];
        nums[length - 1] = getNum;
        length --;
        isTwo = 1;
        minHeap(0, length);
    }
    else{
        nums[0] += nums[length];
        isTwo = 0;
        minHeap(0, length);
    }
    return getNum;
}

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        for(int i = 0; i < n; i++){
            scanf("%d", &nums[i]);
        }

        int a = 0;
        int b = 0;
        int result = 0;
        int addNum = 0;
        int isTwo = 0;
        while(n != 0){
            if (isTwo == 1){
                printf("%d\n", result);
                result += nums[0] + nums[n];
            }
            a = getHFM(n, isTwo,addNum);
        }
        printf("%d\n", addNum);
    }
}
