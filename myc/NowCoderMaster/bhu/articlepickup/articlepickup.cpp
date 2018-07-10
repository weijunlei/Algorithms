#include <stdio.h>
#include <string.h>

void swap(char words[][20], int m, int n){
    char temp[20];
    strcpy(temp, words[m]);
    strcpy(words[m], words[n]);
    strcpy(words[n], temp);
}

int getPartition(char words[][20], int left, int right){
    char *temp = words[left];
    int getIndex = left;
    for(int i = getIndex + 1; i <= right; i++){
        if (strcmp(temp, words[i]) > 0){
            getIndex ++;
            swap(words, getIndex, i);
        }
    }
    swap(words, getIndex ,left);
    return getIndex;
}

void strQuickSort(char words[][20], int left, int right){
    if (left < right){
        int getIndex = getPartition(words, left, right);
        strQuickSort(words, left, getIndex - 1);
        strQuickSort(words, getIndex + 1, right);
    }
}

int main(){
    char words[100][20];
    char temp[20];
    FILE* fp = fopen("test.txt", "r");
    int size = 0;
    bool isWord = false;
    int tempLength = 0;
    while(!feof(fp)){
        int ch = fgetc(fp);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch < 'Z')){
            if (ch >= 'A' && ch <= 'Z'){
                ch = ch - 'A' + 'a';
            }
            temp[tempLength++] = ch;
            temp[tempLength] = 0;
            isWord = true;
        }else if (isWord){
            int i;
            //printf("Hello : %s\n", temp);
            for(i = 0; i < size; i++){
                if (strcmp(words[i], temp) == 0){
                    break;
                }
            }
            if (i == size){
                strcpy(words[size++], temp);
            }
            tempLength = 0;
            isWord = false;
        }
    }
    strQuickSort(words, 0, size - 1);

    //printf("%d\n", size);
    for(int i = 0; i < size; i++){
        printf("%s\n", words[i]);
    }

    return 0;

}
