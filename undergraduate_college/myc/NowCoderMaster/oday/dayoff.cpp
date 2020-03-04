#include <stdio.h>

struct Day{
    int year;
    int month;
    int day;
}days[2];

int isLeapYear(int num){
    int result = 0;
    if ((num % 4 == 0 && num % 100 == 0) || num % 400 == 0){
        result = 1;
    }
    return result;
}

int dayOff(){
    const int months[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int dayCount = 0;
    if (days[1].year > days[0].year){
        for(int i = days[0].year + 1; i < days[1].year; i++){
            if (isLeapYear(i) == 1){
                dayCount += 366;
            }
            else{
                dayCount += 365;
            }
        }
        for(int i = days[0].month + 1; i <= 12; i++){
            if (i == 2 && isLeapYear(days[0].year) == 1){
                dayCount += 1;
            }
            dayCount += months[i];
        }
        for(int i = 1; i < days[1].month; i++){
            if (i == 2 && isLeapYear(days[1].year) == 1){
                dayCount += 1;
            }
            dayCount += months[i];
        }

        dayCount += months[days[0].month] + days[1].day - days[0].day;
        if (days[0].month == 2 && isLeapYear(days[0].year) == 1){
            dayCount += 1;
        }
    }
    else{
        if (days[1].month > days[0].month){
            for(int i = days[0].month + 1; i < days[1].month; i++){
                dayCount += months[i];
            }
            dayCount += days[1].day + months[days[0].month] - days[0].day;
            if (days[0].month == 1 || (days[0].month == 2 && isLeapYear(days[0].year) == 1)){
                dayCount ++;
            }
        }
        else{
            dayCount += days[1].day - days[0].day;
        }
    }

    return dayCount;
}

int main(){
    scanf("%4d%2d%2d", &days[0].year, &days[0].month, &days[0].day);
    scanf("%4d%2d%2d", &days[1].year, &days[1].month, &days[1].day);
    int result = dayOff();
    printf("%d\n", result);
    return 0;
}
