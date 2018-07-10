#include <stdio.h>

int prime[1000];
int isPrime[1001];
int primeSize;

void init(){
    for(int i = 0; i < 1001; i++){
        isPrime[i] = 1;
    }
    primeSize = 0;
    for(int i = 2; i <= 1000; i++){
        if (isPrime[i] == 0) break;
        prime[primeSize++] = i;
        for(int j = i * i; j <= 1000; j += i){
            prime[j] = 0;
        }
    }
}

// 使用指数幂的形式求解，但是存在就是n中存在而a中不存在的幂在阶乘时容易出问题
int main(){
    int n, a;
    init();
    int nPrime[1010];
    int aPrime[1010];
    while(scanf("%d %d", &n, &a)){
        for(int i = 0; i < primeSize; i++){
            nPrime[i] = 0;
            aPrime[i] = 0;
        }

        // 获取n中质数幂指数
        for(int i = 0; i < primeSize; i++){
            int t = n;
            while(t){
                nPrime[i] += t / prime[i];
                t /= prime[i];
            }
        }
        int ans = 1000000;
        // 获取a中质数幂指数
        for(int i = 0; i < primeSize; i++){
            while(a % prime[i] == 0){
                aPrime[i] ++;
                a /= prime[i];
            }
            if (aPrime[i] == 0) continue;
            if (nPrime[i] / aPrime[i] < ans){
                ans = nPrime[i] / aPrime[i];
            }
        }
        printf("%d\n", ans);
    }
}
