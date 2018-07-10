#include <stdio.h>
#include <math.h>

int main(){
    int m, n;
    int mCD[100];
    int nCD[100];
    while(scanf("%d %d", &m, &n)){
        int mSize = 0;
        int nSize = 0;
        int mSum = 0;
        int nSum = 0;
        int mSqrt = int(sqrt(m)) + 1;
        int nSqrt = int(sqrt(n)) + 1;

        for(int i = 1; i < m || i < n; i++){
            if (m % i == 0 && i != m){
                mCD[mSize++] = i;
                mSum += i;
            }
            if (n % i == 0 && i != n){
                nCD[nSize++] = i;
                nSum += i;
            }
        }

        printf("%d,", m);
        for(int i = 0; i < mSize - 1; i++){
            printf("%d+", mCD[i]);
        }
        printf("%d=%d\n", mCD[mSize - 1], mSum);
        printf("%d,", n);
        for(int i = 0; i < nSize - 1; i++){
            printf("%d+", nCD[i]);
        }
        printf("%d=%d\n", nCD[nSize - 1], nSum);
        if (mSum == n && nSum == m){
            printf("1\n");
        }
        else{
            printf("0\n");
        }
    }
    return 0;
}
