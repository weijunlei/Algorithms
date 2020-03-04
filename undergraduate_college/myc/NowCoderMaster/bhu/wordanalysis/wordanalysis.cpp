#include <stdio.h>
#include <string.h>

char inputNames[50][20];
char outputNames[50][20];
int inputSize;
int outputSize;


bool isOnlyNum(char* temp, int tempLength){
	int i;
	for(i = 0; i < tempLength; i++){
		if (temp[i] < '0' || temp[i] > '9'){
			break;
		}
	}
	if (i == tempLength){
		return true;
	}
	else{
		return false;
	}
}

void addOutput(char *str){
	bool shouldAdd = true;;
	for(int i = 0; i < inputSize; i++){
		if (strcmp(str, inputNames[i]) == 0){
			shouldAdd = false;
			break;
		}
	}

	for(int i = 0; i < outputSize; i++){
		if (strcmp(str, outputNames[i]) == 0){
			shouldAdd = false;
			break;
		}
	}

	if (shouldAdd){
        //printf("Added: %s\n", str);
		strcpy(outputNames[outputSize++], str);
	}
}

int main(){
	char inputLines[2000];
	int linesSize = 0;
	inputSize = 0;
	outputSize = 0;

	char ch;
	int isNextLine = 0;
	while(scanf("%c", &ch) != EOF && isNextLine != 2){
		inputLines[linesSize++] = ch;
		if (ch == ';'){
			isNextLine ++;
		}
	}

	int index = 0;
	char temp[20];
	int tempLength = 0;
	bool isWord = false;
	for(index = 0; inputLines[index] != '\n'; index++){
		ch = inputLines[index];
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == '_' || (ch >= '0' && ch <= '9')){
			temp[tempLength++] = ch;
			temp[tempLength] = 0;
			isWord = true;
		}
		else if (isWord){
			if (!isOnlyNum(temp, tempLength)){
				strcpy(inputNames[inputSize++], temp);
			}
			isWord = false;
			tempLength = 0;
		}
	}
    /*
	for(int i = 0; i < inputSize; i++){
        printf("InputName: %s\n", inputNames[i]);
	}*/
    isWord = false;
    tempLength = 0;
	for(index = index + 1; index < linesSize && inputLines[index] != '\n'; index++){
		ch = inputLines[index];
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == '_' || (ch >= '0' && ch <= '9')){
			temp[tempLength++] = ch;
			temp[tempLength] = 0;
			isWord = true;
		}
		else if(isWord){
            //printf("someJudge Str: %s\n", temp);
			if (!isOnlyNum(temp, tempLength)){
				addOutput(temp);
			}
			isWord = false;
			tempLength = 0;
		}
	}

	for(int i = 0; i < outputSize; i++){
		printf("%s\n", outputNames[i]);
	}

	return 0;
}
