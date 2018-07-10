#include <stdio.h>

int prime[10000];
int primeSize;
int isPrime[10001];

void init(){
    for(int i = 1; i <= 10000; i++){
        isPrime[i] = 1;
    }
    primeSize = 0;
    for(int i = 2; i <= 10000; i++){
        if (isPrime[i] == 0) break;
        prime[primeSize++] = i;
        for(int j = i * i; j <= 10000; j += i){
            isPrime[i] = 0;
        }
    }
}


int main(){
    init();
    int n;
    while(scanf("%d", &n) != EOF){
        int isOutput = 0;
        for(int i = 0; i < primeSize; i++){
            if (prime[i] < n && prime[i] % 10 == 1){
                if (isOutput != 0){
                    printf(" %d", prime[i]);
                }
                else{
                    printf("%d", prime[i]);
                    isOutput = 1;
                }
            }
        }
        if (isOutput == 0){
            printf("-1\n");
        }
        else {
            printf("\n");
        }
    }

    return 0;
}
