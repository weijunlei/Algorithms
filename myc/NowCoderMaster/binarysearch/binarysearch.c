#include <stdio.h>

int main(){
    int nums[10] = {1,3,4,5,6,7,8,9,10,11};
    int n;
    int index = -1;
    while (scanf("%d", &n)){
        int left = 0;
        int right = 9;
        while(right >= left){
            int mid = (left + right) / 2;
            if (nums[mid] == n){
                index = mid;
                break;
            }
            else if(nums[mid] > n){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        if (index != -1){
            printf("%d\n", index);
        }
        else{
            printf("No Answer!\n");
        }
    }

    return 0;
}
