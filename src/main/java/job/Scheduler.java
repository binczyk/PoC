package job;

import java.util.Timer;

public class Scheduler {

    public static void main(String[] args) {
        long period = 30000;
        long delay = 0;
        Timer timer = new Timer();
        MyJob myJob = new MyJob();
        timer.scheduleAtFixedRate(myJob, delay, period);
    }
}
