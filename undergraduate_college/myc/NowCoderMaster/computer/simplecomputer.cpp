#include<stdio.h>
#include<stack>

using namespace std;

stack<double> Nums;
stack<int> Operators;
char str[200];
const int mat[][5] = {
    1,0,0,0,0,
    1,0,0,0,0,
    1,0,0,0,0,
    1,1,1,0,0,
    1,1,1,0,0,
};

void getOp(bool &isOperator, int &retNum, int &index){
    if( index == 0 && Operators.empty() == true){
        isOperator = true;
        retNum = 0;
        return;
    }

    if (str[index] == 0){
        isOperator = true;
        retNum = 0;
        return;
    }

    if (str[index] >= '0' && str[index] <= '9'){
        isOperator = false;
        retNum = 0;
        for(; (str[index] >= '0' && str[index] <= '9') && str[index] != 0; index++){
            retNum *= 10;
            retNum += str[index] - '0';
        }
        while (str[index] == ' '){
            index++;
        }
    }
    else if (str[index] == '+' || str[index] == '-' || str[index] == '*' || str[index] == '/'){
        isOperator = true;
        if (str[index] == '+'){
            retNum = 1;
        }
        else if (str[index] == '-'){
            retNum = 2;
        }
        else if (str[index] == '*'){
            retNum = 3;
        }
        else{
            retNum = 4;
        }
        index++;
        while(str[index] == ' '){
            index ++;
        }
        return;
    }
}

int main(){
    while (gets(str)){
        if (str[0] == 0 || str[1] == '0')break;
        bool isOperator;
        int retNum;
        int index = 0;
        while(!Nums.empty()) {
            Nums.pop();
        }
        while(!Operators.empty()){
            Operators.pop();
        }

        while(true){
            getOp(isOperator, retNum, index);
            if (isOperator == false){
                Nums.push((double)retNum);
            }
            else{
                double tmp;
                if (Operators.empty() == true || mat[retNum][Operators.top()] == 1){
                    Operators.push(retNum);
                }
                else{
                    while(mat[retNum][Operators.top()] == 0){
                        int topNum = Operators.top();
                        Operators.pop();
                        double a = Nums.top();
                        Nums.pop();
                        double b = Nums.top();
                        Nums.pop();
                        if (topNum == 1){
                            tmp = a + b;
                        }
                        else if (topNum == 2){
                            tmp = b - a;
                        }
                        else if (topNum == 3){
                            tmp = a * b;
                        }
                        else{
                            tmp = b / a;
                        }
                        Nums.push(tmp);
                    }
                    Operators.push(retNum);
                }
            }

            if (Operators.size() == 2 && Operators.top() == 0) break;
        }
        printf("%.2lf\n", Nums.top());

    }

    return 0;
}
