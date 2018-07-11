#include <stdio.h>

int Tree[1000];

int findRoot(int x){
    if (Tree[x] == -1){
        return x;
    }
    else{
        int temp = findRoot(Tree[x]);
         Tree[x] = temp;
        return temp;
    }
}

int main(){
    int n;
    int m;
    while(scanf("%d",&n) != EOF && n != 0){
        scanf("%d", &m);
        for(int i = 1; i <= n; i++){
            Tree[i] = -1;
        }
        //int tempM = m;
        while (m -- ){
            int a,b;
            scanf("%d%d", &a, &b);
            a = findRoot(a);
            b = findRoot(b);
            //printf("AB:%d %d\n", a, b);
            if (a != b) Tree[a] = b;
        }
        for(int i = 1; i <= n; i++){
            printf("Root :%d\n", Tree[i]);
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if (Tree[i] == -1) ans++;
        }
        printf("%d\n", ans - 1);
    }
    return 0;
}
