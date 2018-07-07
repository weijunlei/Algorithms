#include <stdio.h>

int main(){
    int n;
    char a,b;
    if (scanf("%d %c %c", &n, &a, &b)){
        char nums[n][n];
        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n -1;
        const char ch[2] = {a, b};
        int chIndex = 0;
        while(minRow <= maxRow){
            for(int i = minCol; i <= maxCol; i++){
                nums[minRow][i] = ch[chIndex];
            }
            for(int i = minRow + 1; i <= maxRow; i++){
                nums[i][maxCol] = ch[chIndex];
            }
            if (maxCol > minCol){
                for(int i = maxCol - 1; i >= minCol; i--){
                    nums[maxRow][i] = ch[chIndex];
                }
            }
            if (maxRow > minRow){
                for(int i = maxRow - 1; i >= minRow + 1; i--){
                    nums[i][minCol] = ch[chIndex];
                }
            }
            if (chIndex == 0){
                chIndex = 1;
            }
            else{
                chIndex = 0;
            }
            minRow++;
            minCol++;
            maxRow--;
            maxCol--;
        }
        nums[0][0] = ' ';
        nums[0][n-1] = ' ';
        nums[n- 1][0] = ' ';
        nums[n - 1][n - 1] = ' ';
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                printf("%c", nums[i][j]);
            }
            printf("\n");
        }
    }
    return 0;
}
