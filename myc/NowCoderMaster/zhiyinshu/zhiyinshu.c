#include <stdio.h>

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        int numCount = 0;
        for(int i = 2; i <= n && n != 1; i++){
            while (n % i == 0){
                numCount ++;
                n = n / i;
            }
        }
        printf("%d\n", numCount);
    }
}
