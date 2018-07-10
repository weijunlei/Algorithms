#include <stdio.h>

int multiple(int n){
    if (n == 0 || n == 1){
        return 1;
    }
    int result = 1;
    for(int i = n; i > 1; i --){
        result *= i;
    }
    return result;
}

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        int nums[15];
        int numsCount = 0;
        int multipleSum = 0;
        int tempN = n;
        while(tempN != 0){
            nums[numsCount++] = tempN % 10;
            tempN /= 10;
        }
        printf("%d,", n);
        for(int i = numsCount - 1; i > 0; i--){
            printf("%d!+", nums[i]);
            multipleSum += multiple(nums[i]);
        }
        multipleSum += multiple(nums[0]);
        printf("%d!=%d\n", nums[0], multipleSum);
        if (multipleSum == n){
            printf("Yes\n");
        }
        else{
            printf("No\n");
        }
    }
}
