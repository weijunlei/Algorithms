#include <stdlib.h>
#include <stdio.h>

int main(){
    FILE* fp1 = fopen("D:\\abc0.txt", "w");
    FILE* fp2;
    char ch;
    int tag, numS, numW, numC;
    if (!fp1){
        return;
    }
    while((ch=getchar())!= EOF){
        fputc(ch, fp1);
    }
    fclose(fp1);
    tag = 1;
    fp1 = fopen("D:\\abc0.txt", "r");
    fp2 = fopen("D:\\abc1.txt", "w");
    while((ch = fgetc(fp1)) != EOF){
          if (tag == 1 || ch != ' '){
            fputc(ch, fp2);
          }
          if (ch == ' '){
            tag = 0;
          }else{
            tag = 1;
          }
    }
    fclose(fp1);
    fclose(fp2);

    fp2 = fopen("D:\\abc1.txt", "r");
    numC = 0;
    numW = 0;
    numS = 0;

    tag = 1;
    while((ch = fgetc(fp2)) != EOF){
        if (ch == '.' || ch == '!' || ch == '?'){
            numS++;
        }
        if (tag = 0 && ch != ' ' && ch != '\n'){
            tag = 1;
        }
        if (tag == 1 && (ch == ' ' || ch == '\n')){
            numW++;
            tag = 0;
        }
        numC++;
    }
    if (numW != 0){
        numW ++;
    }
    printf("%d %d %d\n", numC, numW, numS);
    printf("Done!\n");
    return 0;
}
