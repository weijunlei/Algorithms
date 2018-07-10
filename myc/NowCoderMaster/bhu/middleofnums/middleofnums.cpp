#include <stdio.h>

void swap(int* nums, int m, int n){
    int temp = nums[m];
    nums[m] = nums[n];
    nums[n] = temp;
}

int getPartition(int* nums, int left, int right){
    int getNum = nums[left];
    int getIndex = left;
    for(int i = left + 1; i <= right; i++){
        if (getNum > nums[i]){
            getIndex ++;
            swap(nums, getIndex, i);
        }
    }
    swap(nums, getIndex, left);
    return getIndex;
}

int getSpecialValue(int* nums, int index, int left, int right){
    int getIndex = getPartition(nums, left, right);
    if (getIndex == index){
        return nums[getIndex];
    }
    else if(getIndex > index){
        getSpecialValue(nums, index, left, getIndex - 1);
    }
    else{
        getSpecialValue(nums, index, getIndex + 1, right);
    }
}

int main(){
    int nums[100];
    int size = 0;
    FILE* fp = fopen("test.txt", "r");
    while ((fscanf(fp, "%d", &nums[size++])) != EOF);
    fclose(fp);
    size --;
    if (size % 2 == 1){
        int middle = size / 2;
        middle = getSpecialValue(nums, middle, 0, size - 1);
        printf("%d\n", middle);
    }
    else{
        int leftMiddle = size / 2 - 1;
        int rightMiddle = leftMiddle + 1;
        leftMiddle = getSpecialValue(nums, leftMiddle, 0, size - 1);
        rightMiddle = getSpecialValue(nums, rightMiddle, rightMiddle, size - 1);
        printf("%d %d\n", leftMiddle, rightMiddle);
    }
    return 0;
}
