#include <stdio.h>

int main(){
    int n;
    while(scanf("%d", &n)){
        int max = - 10000001;
        int min = 1000001;
        int nums[n];
        for(int i = 0; i < n; i++){
            scanf("%d", &nums[n]);
        }
        for(int i = 0; i < n; i++){
            if (nums[i] > max){
                max = nums[i];
            }
            if (nums[i] < min){
                min = nums[i];
            }
        }
        printf("%d %d\n", max,min);
    }
    return 0;
}
