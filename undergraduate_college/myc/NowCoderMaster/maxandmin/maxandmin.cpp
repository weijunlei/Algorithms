#include <iostream>

using namespace std;

int main(){
    int n;
    while (cin >> n){
        int max = -1000001;
        int min = 1000000;
        for(int i = 0; i < n; i++){
            int temp = 0;
            cin >> temp;
            if (temp > max){
                max = temp;
            }
            if (temp < min){
                min = temp;
            }
        }
        cout << max << " " << min << endl;
    }
}
