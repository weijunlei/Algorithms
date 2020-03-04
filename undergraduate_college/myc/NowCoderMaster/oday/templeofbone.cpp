#include <stdio.h>

char maze[8][8];
int go[][2] = {1, 0,
                -1, 0,
                0, 1,
                0, -1};
int canUsedTime, m, n;
bool canArrive;

void DFS(int x, int y, int time){
    for(int i = 0; i < 4; i++){
        //printf("Hello\n\n");
        int nx = x + go[i][0];
        int ny = y + go[i][1];
        if (nx < 0 || nx >= m || ny < 0 || ny >= n)continue;
        if (maze[nx][ny] == 'X') continue;
        if (maze[nx][ny] == 'D'){
            //printf("Hello %d : %d\n", time, canUsedTime);
            if (time + 1 == canUsedTime){
                canArrive = true;
                return;
            }
            else{
                continue;
            }
        }
        maze[nx][ny] = 'X';
        //printf("nx ny: %d %d\n", nx, ny);
        DFS(nx, ny, time + 1);
        maze[nx][ny] = '.';
        if (canArrive)
            return;
    }
}

int main(){
    while(scanf("%d%d%d", &m, &n, &canUsedTime) != EOF){
        //printf("m:%d n:%d canUsedTime:%d\n", m, n, canUsedTime);
        for(int i = 0; i < m; i++){
            scanf("%s", maze[i]);
        }

        canArrive = false;
        int startX, startY;
        int endX, endY;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //printf("%c", maze[i][j]);
                if (maze[i][j] == 'D'){
                    endX = i;
                    endY = j;
                }
                if (maze[i][j] == 'S'){
                    startX = i;
                    startY = j;
                }
            }
        }
        //printf("position:%d %d %d %d %d\n", endX, endY, startX, startY, canUsedTime);
        if (((endX + endY - startX - startY) % 2) != (canUsedTime % 2)){
            printf("NO\n");
            continue;
        }
        maze[startX][startY] = 'X';
        DFS(startX, startY, 0);
        if (canArrive){
            printf("YES\n");
        }
        else{
            printf("NO\n");
        }
    }
}
