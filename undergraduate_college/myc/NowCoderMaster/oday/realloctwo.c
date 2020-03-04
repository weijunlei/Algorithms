#include <stdlib.h>
#include <stdio.h>


int main(){
    char* str = NULL;
    int count = 0;
    char ch;
    int isWordTwo = 0;
    while(scanf("%c", &ch) != EOF &&(isWordTwo == 0 ||( ch != '\n' && ch != ' '))){
        if (ch == '\n' || ch == ' '){
            isWordTwo = 1;
            continue;
          }
        count++;
        if (count == 1){
            str = (char *)malloc(sizeof(char));
            str[0] = ch;
        }
        else{
            str = (char *)realloc(str, count * sizeof(char));
            str[count - 1] = ch;
        }
    }

    for(int i = 0; i < count; i++){
        printf("%c", str[i]);
    }
    printf("\n");
    return 0;
}
