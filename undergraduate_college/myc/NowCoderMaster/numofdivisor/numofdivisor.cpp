#include <iostream>

using namespace std;

int setnumofdivisor(int num);
int main(){
    int num;
    while (cin >> num){
        int i, j, a[1000], b[1000];
        for(int i = 0; i < num; i++){
            cin >> a[i];
            b[i] = setnumofdivisor(a[i]);
        }
        for(int i = 0; i < num; i++){
            cout << b[i]<< endl;
        }
    }
}

int setnumofdivisor(int num){
    int count = 0;
    int i = 1;
    for(i = 1; i * i<= num; i++){
        if (num % i == 0){
            count += 2;
        }
    }
    if ((i - 1) * (i - 1) == num){
        count --;
    }
    return count;
}
