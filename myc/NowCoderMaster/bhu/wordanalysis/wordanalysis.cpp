#include <stdio.h>
#include <string.h>

int main(){
    char firstLine[100][20];
    char secondLine[100][20];
    char firstChs[1000];
    char secondChs[1000];
    int firstNum = 0;
    int secondNum = 0;
    int ch1Size = 0;
    int ch2Size = 0;

    char ch;
    while(scanf("%c", &ch) != EOF && ch != '\n'){
        firstChs[ch1Size++] = ch;
    }
    firstChs[ch1Size] = 0;
    while(scanf("%c", &ch) != EOF && ch != '\n'){
        secondChs[ch2Size++] = ch;
    }
    secondChs[ch2Size] = 0;

    bool isWord = false;
    char temp[20];
    int tempLength = 0;
    for(int i = 0; i < ch1Size; i++){
        char tempCh = firstChs[i];
        if ((tempCh >= 'a' && tempCh <= 'z') || (tempCh >= 'A' && tempCh <= 'Z') || (tempCh == '_') || (tempCh >= '0' && tempCh <= '9')){
            temp[tempLength++] = tempCh;
            temp[tempLength] = 0;
            isWord = true;
        }
        else if(isWord){
            strcpy(firstLine[firstNum++], temp);
            isWord = false;
            tempLength = 0;
        }
        if (tempCh == ';'){
            break;
        }
    }

    for(int i = 0; i < ch2Size; i++){
        char tempCh = secondChs[i];
        if ((tempCh >= 'a' && tempCh <= 'z') || (tempCh >= 'A' && tempCh <= 'Z') || (tempCh == '_') || (tempCh >= '0' && tempCh <= '9')){
            temp[tempLength++] = tempCh;
            temp[tempLength] = 0;
            isWord = true;
        }
        else if(isWord){
            strcpy(secondLine[secondNum++], temp);
            isWord = false;
            tempLength = 0;
        }
        if (tempCh == ';'){
            break;
        }
    }

    for(int i = 0; i < firstNum; i++){
        printf("%s\n", firstLine[i]);
    }
    printf("Hello World\n\n");
    for(int i = 0; i < secondNum; i++){
        printf("%s\n", secondLine[i]);
    }
}
