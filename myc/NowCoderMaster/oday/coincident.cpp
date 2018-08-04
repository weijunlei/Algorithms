#include <stdio.h>
#include <string.h>

int max(int a, int b){
    return a > b ? a : b;
}

int main(){
    int dp[101][101];
    char str1[101];
    char str2[101];

    while(scanf("%s%s", str1, str2) != EOF){
        int strLength1 = strlen(str1);
        int strLength2 = strlen(str2);
        for(int i = 0; i < strLength1; i++){
            dp[i][0] = 0;
        }
        for(int i = 0; i < strLength2; i++){
            dp[0][i] = 0;
        }
        for(int i = 1; i <= strLength1; i++){
            for(int j = 1; j <= strLength2; j++){
                if (str1[i - 1] == str2[j - 1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        printf("%d\n", dp[strLength1][strLength2]);
    }
}
