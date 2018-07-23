#include <stdio.h>

bool isLeapYear(int x){
    if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)){
        return true;
    }
    else{
        return false;
    }
}

int months[] ={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


int main(){
    int year;
    int days;
    while(scanf("%d%d", &year, &days) != EOF){
        if (!isLeapYear(year) && days == 366){
            printf("%04d-%02d-%02d\n", year, 1, 1);
        }
        else{
            int monthCount = 1;
            if (isLeapYear(year)){
                months[2] = 29;
            }
            else{
                months[2] = 28;
            }
            while(days > months[monthCount]){
                days -= months[monthCount++];
            }
            printf("%04d-%02d-%02d\n", year, monthCount, days);
        }
    }
}
