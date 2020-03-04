#include <stdio.h>

typedef struct DATE{
    int year;
    int month;
    int day;
}Date;

int leapYear(int year){
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
        return 1;
    }
    else{
        return 0;
    }
}

int diffDate(Date* date1, Date* date2){
    int diffDate = 0;
    int i = 0;
    const int months[13] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 30, 31, 30, 31};
    if (date1->year == date2->year){
        if (date1->month == date2->month){
            diffDate = date1->day - date2->day;
        }
        else{
            for(i = date1->month + 1; i < date2->month; i++){
                diffDate += months[i];
            }
            diffDate += months[date1->month] + date2->day - date1->day;
            if (leapYear(date1 -> year)){
                if (date1->month <= 2 && date2->month > 2){
                    diffDate ++;
                }
            }
        }
    }
    else{
        for(i = date1->year + 1; i < date2->year; i++){
            if (leapYear(i)){
                diffDate += 366;
            }
            else{
                diffDate += 365;
            }
        }
        for(i = date1->month + 1; i <= 12; i++){
            diffDate += months[i];
        }
        diffDate += months[date1->month] + date2->day - date1->day;
        if (date1->month < 2){
            if (leapYear(date1->year)){
                diffDate ++;
            }
        }
        for(int i=1; i < date2->month; i++){
            diffDate += months[i];
        }
        if (date2->month > 2){
            if (leapYear(date2->year)){
                diffDate ++;
            }
        }
    }

    return diffDate;
}

int main(){
    int diff = 0;
    Date date1, date2;
    scanf("%4d%2d%2d", &date1.year, &date1.month, &date1.day);
    scanf("%4d%2d%2d", &date2.year, &date2.month, &date2.day);
    diff = diffDate(&date1, &date2);
    printf("%d\n", diff);
    return 0;
}

