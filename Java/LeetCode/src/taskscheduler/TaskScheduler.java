package taskscheduler;

import java.util.Arrays;

/**
 * @author : Qingfeng
 * @date : 2018/8/30
 * 任务安排
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/54/others/122/
 */
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0){
            return 0;
        }
        if (n == 0){
            return tasks.length;
        }

        int[] taskCounts = new int[26];

        for(int i = 0; i < 26; i++){
            taskCounts[i] = 0;
        }

        for(int i = 0; i < tasks.length; i++){
            taskCounts[tasks[i] - 'A'] ++;
        }

        Arrays.sort(taskCounts);

        int originLength = tasks.length;
        int maxIndex = 25;
        int maxNum = taskCounts[maxIndex];
        //System.out.println(maxNum);
        for(; maxIndex > 0 && taskCounts[maxIndex] == maxNum; maxIndex --);
        //System.out.println(maxIndex);
        if (((maxNum - 1) * (n + 1) + 25 - maxIndex) > originLength)
            originLength = (maxNum - 1) * (n + 1) + 25 - maxIndex;
        return originLength;
    }
}
