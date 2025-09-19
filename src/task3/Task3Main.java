package task3;

public class Task3Main {
    public static void main(String[] args) throws InterruptedException {
        BankHesabi bankHesabi = new BankHesabi(1000);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    bankHesabi.medaxilEt(10);
                }
            }
        };
        Thread valideyn = new Thread(task);
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    bankHesabi.mexaricEt(10);
                }
            }
        };
        Thread usaq = new Thread(task);
        valideyn.start();
        usaq.start();
        valideyn.join();
        usaq.join();
        System.out.println(bankHesabi.getBalans());


    }
}
