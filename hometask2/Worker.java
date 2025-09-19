package hometask2;

import java.util.Random;

public class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("İşçi [ad] rəf X-i düzür...");
        Random random = new Random();
        int i = random.nextInt(3) + 1;
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
