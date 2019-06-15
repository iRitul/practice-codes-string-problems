import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;
class ScheduledTask extends TimerTask {
    Date now; 
    public void run() {
        now = new Date();                  
        System.out.println("Time is :" + now); 
    }
}
public class SchedulerMain {
    public static void main(String args[]) throws InterruptedException {
        Timer time = new Timer();               
        ScheduledTask st = new ScheduledTask(); 
        time.schedule(st, 0, 1000);           
        for (int i = 0; i <= 5; i++) {
            System.out.println("Execution in Main Thread...." + i);
            Thread.sleep(2000);
            if (i == 5) {
                System.out.println("Application Terminates");
                System.exit(0);
            }
        }
    }
}