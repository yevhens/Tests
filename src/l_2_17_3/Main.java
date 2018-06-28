package l_2_17_3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Here comes the main");

        int[] array = new int[1000];

        for (int x = 0; x < 1000; x++) {
            int random = (int) (Math.random() * 1000);
            array[x] = random;
        }

        MySumCount myThread1 = new MySumCount();

        myThread1.setStartindex(100);

        myThread1.setStopindex(200);

        myThread1.setArray(array);

        myThread1.start();
        try {
            Thread.sleep(1000);
            System.out.println("Waiting for the Thread-2");
            MySumCountRunnable mySumCountRunnable = new MySumCountRunnable(100, 200, array);
            Thread thread = new Thread(mySumCountRunnable);
            thread.start();


        } catch (InterruptedException ie) {
        }
    }
}
