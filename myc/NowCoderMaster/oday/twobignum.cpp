#include <stdio.h>

int main(){
    int input[4][5];
    int output[2][5];
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 5; j++){
            scanf("%d", &input[i][j]);
        }
    }

    int max1;
    int max2;
    int maxIndex1;
    int maxIndex2;

    for(int j = 0; j < 5; j++){
        if (input[0][j] > input[1][j]){
            max1 = input[0][j];
            max2 = input[1][j];
            maxIndex1 = 0;
            maxIndex2 = 1;
        }
        else{
            max2 = input[0][j];
            max1 = input[1][j];
            maxIndex2 = 0;
            maxIndex1 = 1;
        }
        //printf("origin: %d:%d\n", maxIndex1, maxIndex2);
        for(int i = 2; i < 4; i++){
            if (input[i][j] > max1){
                //printf("max1: %d:%d:%d\n", i, input[i][j], max1);
                max2 = max1;
                maxIndex2 = maxIndex1;
                max1 = input[i][j];
                maxIndex1 = i;
            }else if (input[i][j] > max2){
               // printf("max1: %d:%d:%d\n", i, input[i][j], max2);
                max2 = input[i][j];
                maxIndex2 = i;
            }
        }
        //printf("%d:%d\n", maxIndex1, maxIndex2);
        if (maxIndex1 < maxIndex2){
            output[0][j] = max1;
            output[1][j] = max2;
        }else{
            output[0][j] = max2;
            output[1][j] = max1;
        }
    }

    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 5; j++){
            if (j != 4)
                printf("%d ", output[i][j]);
            else
                printf("%d\n", output[i][j]);
        }
    }
}
