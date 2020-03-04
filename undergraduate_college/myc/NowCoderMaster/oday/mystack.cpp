#include <stdio.h>
#include <stack>
#include <string.h>
using namespace std;

stack<int> chStack;

int main(){
    char chs[100];
    char output[100];
    while(scanf("%s", chs) != EOF){
        while(chStack.empty() == false){
            chStack.pop();
        }
        int strLength = strlen(chs);
        for(int i = 0; i < strLength; i++){
            //printf("%c %d\n", chs[i], i);
            output[i] = ' ';
            if(chs[i] == ')'){
                if(chStack.empty() == false){
                    chStack.pop();
                }
                else{
                    output[i] = '?';
                }
            }
            else if (chs[i] == '('){
                chStack.push(i);
            }
        }
        while(chStack.empty() == false){
            int getNum = chStack.top();
            //printf("A GetNum:%d\n", getNum);
            chStack.pop();
            output[getNum] = '$';
        }
        output[strLength] = '\0';
        printf("%s\n", output);
    }

    return 0;
}
