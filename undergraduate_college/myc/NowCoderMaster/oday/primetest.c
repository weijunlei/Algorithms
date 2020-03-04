#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int isPrime(int x){
    int bount = (int)sqrt(x);
    int result = 1;
    for(int i = 2; i <= bount + 1; i++){
        if (x % i == 0){
            result = 0;
            break;
        }
    }
    return result;
}

int main(){
    int n;
    scanf("%d", &n);
    for(int i = n; i >= 2; i--){
        if (isPrime(i) && isPrime(i - 2)){
            printf("%d %d\n", i, i - 2);
            break;
        }
    }

    return 0;
}



