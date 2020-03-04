#include <stdio.h>

int gcd(int a, int b){
    while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main(){
    int a , b;
    while(scanf("%d %d", &a, &b)){
        int abGCD = gcd(a, b);
        printf("%d/%d\n", a/abGCD, b/abGCD);
    }
    return 0;
}
