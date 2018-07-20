#include <stdio.h>
#include <math.h>


int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        int primeCount = 0;
        int bound = (int)sqrt(n) + 1;
        for(int i = 2; i <= bound && n != 0; i++){
            while(n % i == 0){
                primeCount++;
                n /= i;
            }
        }

        printf("%d\n", primeCount);
    }
}
