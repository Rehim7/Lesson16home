package hometask2;

public class hm2main {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                worker.run();
            }
        };
        Thread Leyla = new Thread(runnable);
        Thread Kamal = new Thread(runnable);

        Leyla.start();
        Kamal.start();
        while (Leyla.isAlive() && Kamal.isAlive()){
            Thread.sleep(1000);
            System.out.println(Leyla.getState());
            System.out.println(Kamal.getState());
        }
        if (Leyla.isDaemon() && Kamal.isDaemon()){
            System.out.println("📚 Bütün rəflər düzəldi!");
        }




    }


}
