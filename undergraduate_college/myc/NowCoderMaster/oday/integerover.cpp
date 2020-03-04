#include <stdio.h>


bool mark[1010];
int prime[1010];
int primeSize;

void init(){
    primeSize = 0;
    for(int i = 0; i <= 1000; i++){
        mark[i] = false;
    }
    for(int i = 2; i <= 1000; i++){
        if (mark[i])
            continue;
        mark[i] = true;
        prime[primeSize++] = i;
        for(int j = i * i; j <= 1000; j += i){
            mark[j] = true;
        }
    }
}

int primeCount[1010];
int primeCount2[1010];


int main(){
    int n, a;
    init();

    while(scanf("%d%d", &n, &a) == 2){
        for(int i = 0; i < primeSize; i++){
            primeCount[i] = primeCount2[i] = 9;
        }
        for(int i = 0; i < primeSize; i++){
            int t = n;
            while(t){
                primeCount[i] += t / prime[i];
                t = t / prime[i];
            }
        }

        int ans = -1;
        for(int i = 0; i < primeSize; i++){
            while(a % prime[i] == 0){
                primeCount2[i]++;
                a /= prime[i];
            }
            if (primeCount2[i] == 0) continue;
            if (primeCount[i] / primeCount2[i] < ans || ans == -1){
                ans = primeCount[i] / primeCount2[i];
            }
        }

        printf("%d\n", ans);
    }

    return 0;
}
