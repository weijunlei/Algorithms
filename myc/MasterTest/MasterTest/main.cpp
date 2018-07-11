#include <stdio.h>
#include <string.h>

int main(){
    char nums[30];
    while(scanf("%s", nums) != EOF){
        int numSize = strlen(nums);
        int pointPos = 0;
        for(int i = 0; nums[i] != 0; i++){
            if (nums[i] == '.'){
                break;
            }
            pointPos ++;
        }
        if (pointPos == 1){
            if (nums[0] == '0'){
                int firstNotZero = -1;
                for(int i = 2; i < numSize; i++){
                    if (nums[i] != '0'){
                        firstNotZero = i;
                        printf("%c", nums[i]);
                        if (i != numSize - 1){
                            i ++;
                            printf(".");
                            for(; i < numSize; i++){
                                printf("%c", nums[i]);
                            }
                        }
                        printf("e-%d\n", firstNotZero - 1);
                    }

                }
            }
            else{
                printf("%s\n", nums);
            }
        }
        else if (pointPos != numSize){
            printf("%c.", nums[0]);
            for(int i = 1; i < numSize; i++){
                if (i != pointPos){
                    printf("%c", nums[i]);
                }
            }
            printf("e%d\n", pointPos - 1);
        }
        else{
            int zeroNums = 0;
            for(int i = numSize - 1; i >= 0 && nums[i] == '0'; i--){
                zeroNums++;
            }
            //printf("%d\n", zeroNums);
            printf("%c", nums[0]);
            if (zeroNums != numSize - 1){
                printf(".");
            }
            for(int i = 1; i < numSize - zeroNums; i++){
                printf("%c", nums[i]);
            }
            printf("e%d\n", numSize - 1);
        }
    }
    return 0;
}
