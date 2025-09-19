package task2;


public class Task2  {
    public static void main(String[] args) {
        Simvol task = new Simvol("*",1000);
        Simvol task1 = new Simvol("+",1000);
        Simvol task2 = new Simvol("==",1000);
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task1);
        Thread thread3 = new Thread(task2);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
