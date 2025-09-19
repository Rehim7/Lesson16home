package hometask;

public class htmain {
    public static void main(String[] args) throws InterruptedException {
        RunnerA runnerA = new RunnerA();
        RunnerB runnerB = new RunnerB();
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                runnerA.run();
            }
        };
        Thread yarisci1 = new Thread(task1);

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                runnerB.run();
            }
        };
        Thread yarisci2 = new Thread(task2);

        yarisci1.start();
        yarisci2.start();
        yarisci1.join();
        yarisci2.join();




    }
}
