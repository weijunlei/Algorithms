package taskscheduler;

/**
 * @author : Qingfeng
 * @date : 2018/8/30
 */
public class Main {
    public static void main(String[] args){
        TaskScheduler taskScheduler = new TaskScheduler();
        char[] chs = {'A','A','A','B','B','B'};
        System.out.println(taskScheduler.leastInterval(chs, 2));
    }
}
