#include <stdio.h>

struct Point{
    int val;
    int right, down, leftdown, rightdown;
}matrix[20][20];

int main(){
    FILE *fp = fopen("test.txt", "r");
    int i, j, k;
    for(int i = 1; i <= 19; i++){
        for(int j = 1; j <= 19; j++){
            fscanf(fp, "%d", &matrix[i][j].val);
            matrix[i][j].right = matrix[i][j].down = matrix[i][j].leftdown = matrix[i][j].rightdown = 0;
        }
    }
    fclose(fp);
    int hasWin = 0;
    int temp = 0;

    for(i = 1; i < 20; i++){
        for(j = 1; j < 20; j++){
            temp = matrix[i][j].val;
            int sameCount = 0;
            if (temp == 0){
                continue;
            }
            //遍历右
            if (j <= 15 && matrix[i][j].right == 0){
                for(k = 1; k < 5;k++){
                    if (matrix[i][j+k].val == temp){
                        matrix[i][j+k].right = 1;
                    }
                    else{
                        break;
                    }
                }
                if (k == 5){
                    hasWin = 1;
                    break;
                }
            }
            // 遍历下
            if (i <= 15 && matrix[i][j].down == 0){
                for(k = 1; k < 5; k++){
                    if (matrix[i+k][j].val == temp){
                        matrix[i+k][j].down = 1;
                    }
                    else{
                        break;
                    }
                }
                if (k == 5){
                    hasWin = 1;
                    break;
                }
            }
            // 遍历右下
            if (j <= 15 && matrix[i][j].rightdown == 0){
                for(k = 1; k < 5; k++){
                    if (matrix[i+k][j+k].val == temp){
                        matrix[i+k][j+k].rightdown = 1;
                    }
                    else{
                        break;
                    }
                }
                if (k == 5){
                    hasWin = 1;
                    break;
                }
            }

            // 遍历左下
            if (j >= 5 && matrix[i][j].leftdown == 0){
                for(k = 1; k < 5; k++){
                    if (matrix[i - k][j -k].val == temp){
                        matrix[i - k][j - k].leftdown = 1;
                    }
                    else{
                        break;
                    }
                }
                if (k == 5){
                    hasWin = 1;
                    break;
                }
            }
        }
        if (hasWin == 1){
            break;
        }
    }

    if (hasWin == 1){
        printf("%d:(%d,%d)\n", temp, i, j);
    }
    else{
        printf("no\n");
    }

    return 0;
}
