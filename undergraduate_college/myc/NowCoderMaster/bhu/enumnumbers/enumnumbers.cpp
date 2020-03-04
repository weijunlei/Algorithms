#include <stdio.h>
#include <string.h>

int main(){
    char values[100][20];
    char ch[1000];
    int size = 0;
    int valuesNums = 0;
    char c;
    while(scanf("%c", &c) != EOF && c != '\n'){
        ch[size++] = c;
    };
    ch[size] = 0;
    int defineBegin = 0;
    for(int i = 0; i < size; i++){
        if (ch[i] == '{'){
            defineBegin = i;
            break;
        }
    }
    bool isWord = false;
    char temp[20];
    int tempLength = 0;
    for(int i = defineBegin + 1; i < size; i++){
        char tempCh = ch[i];
        if ((tempCh >= 'a' && tempCh <= 'z') || (tempCh >= 'A' && tempCh <= 'Z') || (tempCh == '_') || (tempCh >= '0' && tempCh <= '9')){
            temp[tempLength++] = tempCh;
            temp[tempLength] = 0;
            isWord = true;
        }
        else if(isWord){
            strcpy(values[valuesNums++], temp);
            isWord = false;
            tempLength = 0;
        }
        if (tempCh == '}'){
            break;
        }
    }

    for(int i = 0; i < valuesNums; i++){
        printf("%s %d\n", values[i], i);
    }
}
