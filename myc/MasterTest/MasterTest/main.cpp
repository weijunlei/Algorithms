#include <iostream>
#include <cmath>

using namespace std;
int main(){
    long num;
    while (cin >> num){
        int primeFactorCount = 0;
        long sqrtNum = sqrt(num);
        for(int i = 2; i <= sqrtNum; i++){
            while(num % i == 0){
                num = num / i;
                primeFactorCount ++;
            }
            if (num <= 1){
                break;
            }
        }
        if (num > 1){
            primeFactorCount ++;
        }
        cout << primeFactorCount;
    }
    return 0;
}
