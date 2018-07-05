#include <iostream>
#include <string>

using namespace std;

int main(){
    string str;
    int preIndex = -1;
    while (cin >> str){
        int inputNum = 0;
        for(int i = 0; i < str.length(); i++){
            char tempCh = str.at(i);
            int curIndex = int(tempCh - 'a');
            if (curIndex < 15){
                inputNum += curIndex % 3 + 1;
                curIndex = curIndex / 3;
            }
            else if(curIndex < 19){
                inputNum += (curIndex - 15) % 4 + 1;
                curIndex = 5;
            }
            else if(curIndex < 22){
                inputNum += (curIndex - 19) % 3 + 1;
                curIndex = 6;
            }
            else{
                inputNum += (curIndex - 22) % 4 + 1;
                curIndex = 7;
            }
            if (preIndex == curIndex){
                inputNum += 2;
            }
            preIndex = curIndex;
        }
        cout << inputNum;
    }
}
