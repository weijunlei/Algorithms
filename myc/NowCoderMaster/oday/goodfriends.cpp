#include <stdio.h>

int road[1001];
int sum[1001];

int findRoot(int x){
    if (road[x] == -1){
        return x;
    }
    else{
        int temp = findRoot(road[x]);
        road[x] = temp;
        return temp;
    }
}

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        for(int i = 0; i <= 1000; i++){
            road[i] = -1;
            sum[i] = 1;
        }
        for(int i = 0; i < n; i++){
            int a, b;
            scanf("%d%d", &a, &b);
            a = findRoot(a);
            b = findRoot(b);
            if (a != b){
                road[a] = b;
                sum[b] += sum[a];
            }
        }

        int ans = 1;
        for(int i = 0; i <= 1000; i++){
            if (sum[i] > ans){
                ans = sum[i];
            }
        }
        printf("%d\n", ans);
    }
}
