#include <iostream>

using namespace std;

int main(){
    char ch[4];
    while(cin >> ch){
        cout<< ch[3] << ch[2] << ch[1] << ch[0];
    }
    return 0;
}
