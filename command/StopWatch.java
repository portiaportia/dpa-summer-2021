import java.util.concurrent.TimeUnit;

public class StopWatch {

    public StopWatch() {

    }

    public void countDownOneMin() {
        countDownSec(0, 59);
    }

    public void countDownFiveMin() {
        countDown(5, 0);
    }

    public void countDownThirtySec() {
        countDownSec(0, 29);
    }

    private void countDown(int min, int sec) {
        for (int i = min - 1; i >= 0; i--) {
            countDownSec(i, 59);
        }
    }

    private void countDownSec(int min, int sec) {
        for (int i = sec; i >= 0; i--) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(getTwoDigits(min) + ":" + getTwoDigits(i));

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (Exception e) {
                System.out.println("Timmer error");
            }
        }
    }

    private String getTwoDigits(int num) {
        if (num >= 10)
            return "" + num;

        return "0" + num;
    }

}