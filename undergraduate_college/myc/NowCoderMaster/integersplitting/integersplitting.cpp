#include <iostream>

using namespace std;
int main(){
    int n;
    int* result = new int[1000001];
    while(cin >> n){
        result[0] = 1;
        result[1] = 1;
        for(int i = 2; i <= n; i ++){
            if ( i % 2 == 0){
                result[i] = (result[i - 1] + result[i / 2]) % 1000000000;
            }
            else{
                result[i] = result[i - 1] % 1000000000;
            }
        }
        cout << result[n];
    }
    delete result;
}
