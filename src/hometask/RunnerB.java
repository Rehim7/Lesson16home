package hometask;

import java.util.Random;

public class RunnerB implements Runnable{


    @Override
    public void run() {
        Random random = new Random();
        System.out.println("Runner B : Yarisa basladi");
        int i = random.nextInt(5) + 1;
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Runner B : Yarisi bitirdi");
    }
}
