#include <stdio.h>
#include <string.h>

int main(){
    char nums[12];
    while(scanf("%s", nums)){
        int n = 0;
        int m = 0;
        int strLength = strlen(nums);

        for(int i = 0; i < strLength; i++){
            n *= 10;
            m *= 10;
            n += nums[i] - '0';
            m += nums[strLength - 1 - i] - '0';
        }
        if (m % n == 0){
            printf("%d*%d=%d\n", n, m/n, m);
        }
        else{
            for(int i = 0; i < strLength; i++){
                printf("%c", nums[i]);
            }
            printf(" ");
            for(int i = 0; i < strLength; i++){
                printf("%c", nums[strLength - 1 - i]);
            }
            printf("\n");
        }
    }
    return 0;
}
