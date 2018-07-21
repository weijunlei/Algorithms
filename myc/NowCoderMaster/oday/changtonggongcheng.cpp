#include <stdio.h>

int road[100];

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
    int m, n;
    while(scanf("%d%d", &m, &n) == 2){
        for(int i = 0; i <= m; i++){
            road[i] = -1;
        }
        for(int i = 0; i < n; i++){
            int a,b;
            scanf("%d%d", &a, &b);
            int rootA = findRoot(a);
            int rootB = findRoot(b);
            if (rootA != rootB){
                road[rootA] = rootB;
            }
        }
        int ans = 0;
        for(int i = 1; i <= m; i++){
            if (road[i] == -1)
                ans++;
        }
        printf("%d\n", ans - 1);
    }
}
