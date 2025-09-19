package task1;

public class AzalanSaygac implements Runnable{
    @Override
    public void run() {
        for (int i = 10; i > 0; i--){
            System.out.println("Azalan : " + i);
        }
    }
}
