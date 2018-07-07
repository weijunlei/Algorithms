#include <stdio.h>

typedef struct CHANNEL{
    int startTime;
    int endTime;
}Channel;

void swap(Channel* channels, int m, int n){
    int tempStartTime = channels[m].startTime;
    int tempEndTime = channels[m].endTime;
    channels[m].startTime = channels[n].startTime;
    channels[m].endTime = channels[n].endTime;
    channels[n].startTime = tempStartTime;
    channels[n].endTime = tempEndTime;
}

int getPartition(Channel* channels, int left, int right){
    Channel getChannel = channels[left];
    int getIndex = left;
    for(int i = left + 1; i <= right; i++){
        if (getChannel.endTime > channels[i].endTime)
        {
            getIndex ++;
            swap(channels, getIndex, i);
        }
    }
    swap(channels, getIndex, left);
    return getIndex;
}

void quickSort(Channel* channnels, int left, int right){
    if (right > left){
        int getIndex = getPartition(channnels, left, right);
        quickSort(channnels, left, getIndex - 1);
        quickSort(channnels, getIndex + 1, right);
    }
}

int main(){
    int n;
    while(scanf("%d",&n) != EOF && n != 0){
        Channel channels[n];
        int numOfChannels = 0;
        int firstEnd = 0;
        for(int i = 0; i < n; i++){
            scanf("%d %d", &channels[i].startTime, &channels[i].endTime);
        }
        quickSort(channels, 0, n - 1);
        firstEnd = channels[0].endTime;
        numOfChannels = 1;
        for(int i = 1; i < n; i ++){
            if (channels[i].startTime >= firstEnd){
                numOfChannels ++;
                firstEnd = channels[i].endTime;
            }
        }
        printf("%d\n", numOfChannels);
    }
}


