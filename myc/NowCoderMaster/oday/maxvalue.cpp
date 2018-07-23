#include <stdio.h>

int main(){
    int m, n;
    int nums[100][100];
    while(scanf("%d%d", &m, &n) != EOF){
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j++){
                scanf("%d", &nums[i][j]);
            }
        }


        for(int i = 0; i < m; i++){
            int maxValue = -1;
            int maxIndex = -1;
            int sumOfLine = 0;
            for(int j = 0; j < n; j++){
                sumOfLine += nums[i][j];
                if (maxValue < nums[i][j] || maxValue == -1){
                    maxValue = nums[i][j];
                    maxIndex = j;
                }
            }
            nums[i][maxIndex] = sumOfLine;
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (j != n - 1){
                    printf("%d ", nums[i][j]);
                }
                else{
                    printf("%d\n", nums[i][j]);
                }
            }
        }
    }
    return 0;
}
