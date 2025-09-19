package task1;

    public class Task1 implements Runnable {


        @Override
        public void run() {


        }

        public static void main(String[] args) {
            ArtanSaygac artanSaygac = new ArtanSaygac();
            AzalanSaygac azalanSaygac = new AzalanSaygac();
            Thread thread = new Thread(azalanSaygac);
            Thread thread1 = new Thread(artanSaygac);
            thread.start();
            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            thread1.start();
            try {
                thread1.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
