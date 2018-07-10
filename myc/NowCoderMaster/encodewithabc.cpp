#include <stdio.h>

char nums[100];

int myPow(int m, int n){
    int result = 1;
    for(int i = 1; i <= n; i++){
        result *= m;
    }
    return result;
}

int main(){
    int m, n;
    while(scanf("%d %s %d", &m, nums, &n)){
        long resultNum = 0;
        for(int i = 0; nums[i] != 0; i++){
            resultNum *= m;
            if (nums[i] >= '0' && nums[i] <= '9'){
                resultNum += nums[i] - '0';
            }
            else if(nums[i] >= 'a'){
                resultNum += nums[i] - 'a' + 10;
            }
            else{
                resultNum += nums[i] - 'A' + 10;
            }
        }
        int numsCount = 0;
        int temp = resultNum;
        while(temp != 0){
            temp /= n;
            numsCount++;
        }
        for(int i = numsCount - 1; i>= 0; i--){
            temp = resultNum / myPow(n, i);
            resultNum -= temp * myPow(n, i);
            if (temp <= 9){
                printf("%d", temp);
            }
            else{
                char ch = 'A' + temp - 10;
                printf("%c", ch);
            }
        }
    }
}
