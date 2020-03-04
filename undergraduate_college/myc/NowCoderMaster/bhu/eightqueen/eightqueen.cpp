#include <stdio.h>

char queens[8][3];
char str[10];
int queenSize;

bool hasBattle(){
    bool result = false;
    int minusX = 0;
    int minusY = 0;

    for(int i = 1; i < 8; i++){
        for(int j = 0; j < i; j++){
            minusX = queens[i][0] - queens[j][0];
            minusY = queens[i][1] - queens[j][1];
            if (minusX == minusY || minusX == - minusY){
                result = true;
                break;
            }
        }
        if (result == true){
            break;
        }
    }
    return result;
}

int main(){
    while(scanf("%s", str) != EOF){
        queenSize = 0;
        bool isBattle = false;
        int answerPos = 0;
        int ans[9];
        for(int i = 0; i < 9; i ++){
            ans[i] = 0;
        }
        int addedQueen = -1;
        for(int i = 0; str[i] != 0; i++){
            char ch = str[i];
            if (ch != '*'){
                if (ans[ch - '1'] == 1){
                    isBattle = true;
                    break;
                }
                else{
                    ans[ch - '1'] = 1;
                }
                queens[queenSize][0] = '1' + i;
                queens[queenSize][1] = ch;
                queens[queenSize][2] = 0;
                queenSize++;
            }
            else{
                answerPos = i;
            }
        }
        int answer = -1;
        if (!isBattle){
            for(int i = 0; i < 9; i++){
                    if (ans[i] == 0){
                        answer = i;
                        queens[queenSize][0] = answerPos + '1';
                        queens[queenSize][1] = answer + '1';
                        queens[queenSize][2] = 0;
                        queenSize++;
                        break;
                    }
            }
            isBattle = hasBattle();
        }
        if (!isBattle){
                printf("%d\n", answer + 1);
            }
            else{
                printf("No Answer\n");
            }

    }
    return 0;
}
