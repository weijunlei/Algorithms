#include <iostream>
#define MAXNUM 1000001

using namespace std;
int main(){
    int n;
    int result[MAXNUM];
    result[0] = 1;
    result[1] = 1;
    for(int i = 2; i < MAXNUM; i ++){
        if ( i % 2 == 0){
            result[i] = (result[i - 1] + result[i / 2]) % 1000000000;
        }
        else{
            result[i] = result[i - 1] % 1000000000;
        }
    }
    while(cin >> n){
        cout << result[n];
    }
}
