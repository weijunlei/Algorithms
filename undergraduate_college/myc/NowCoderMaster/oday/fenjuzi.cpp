#include <stdio.h>
#define OFFSET 2002
int dp[101][4001];
int list[101];
int main(){
    int t;
    int cas = 0;
    scanf("%d", &t);
    while(t -- != 0){
        int n;
        scanf("%d", &n);
        bool HaveZero = false;
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            scanf("%d", &list[++cnt]);
            if (list[cnt] == 0){
                cnt --;
                HaveZero = true;
            }
        }
        n = cnt;
        for(int i = -2000; i <= 2000; i++){
            dp[0][i + OFFSET] = -1;
        }

        dp[0][OFFSET] = 0;
        for(int i = 1; i <= n; i++){
            for(int j = -2000; j <= 2000; j++){
                int temp1 = -1;
                int temp2 = -1;
                if (j + list[i] <= 2000 && dp[i-1][j+list[i] + OFFSET] != -1){
                    temp1 = dp[i-1][j+list[i] + OFFSET] + list[i];
                }
                if (j - list[i] >= -2000 && dp[i-1][j - list[i] + OFFSET] != -1){
                    temp2 = dp[i-1][j-list[i]+OFFSET] + list[i];
                }
                if (temp1 < temp2){
                    temp1 = temp2;
                }
                if (temp1 < dp[i-1][j+OFFSET]){
                    temp1 = dp[i-1][j+OFFSET];
                }
                dp[i][j+OFFSET] = temp1;
            }
        }

        printf("Case %d: ", ++cas);
        if (dp[n][OFFSET] == 0){
            if (HaveZero){
                printf("0\n");
            }else{
                printf("-1\n");
            }
        }
        else{
            printf("%d\n", dp[n][0+OFFSET] / 2);
        }
    }
    return 0;
}
