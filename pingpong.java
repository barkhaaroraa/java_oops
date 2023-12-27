/* Implement the PingPong program using runnable
In one second, approximately print
2 ping
1 pong
Author:barkha arora 500105541
*/

public class pingpong implements Runnable {
    private String word;
    private int delay;
    private long endTime;

    public pingpong(String whatToSay, int delayTime, long duration) {
        word = whatToSay;
        delay = delayTime;
        endTime = System.currentTimeMillis() + duration;
    }

    public void run() {
        try {
            while (System.currentTimeMillis() < endTime) {
                System.out.print(word + " ");
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {
        long duration = 5000; 
        Runnable ping = new pingpong("ping", 200, duration);
        Runnable pong = new pingpong("pong", 600, duration);

        Thread pingThread = new Thread(ping);
        Thread pongThread = new Thread(pong);

        pingThread.start();
        pongThread.start();
    }
}