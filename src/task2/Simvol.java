package task2;

public class Simvol implements Runnable{
    String simvol;
    int count;

    public Simvol(String simvol, int count) {
        this.simvol = simvol;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++){
            System.out.print(simvol);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
