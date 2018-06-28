package l_2_17_2;

public class MyTimeBomb extends Thread {

    public void run() {

        for (int x = 10; x > 0; x--) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + x);
                Thread.sleep(0);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }


        }
        System.out.println("Boom");


    }

    public static void main(String[] args) {
        MyTimeBomb myTimeBomb=new MyTimeBomb();
        MyTimeBombRunnable myTimeBomb2=new MyTimeBombRunnable();
        Thread one=new Thread(myTimeBomb2);
        myTimeBomb.start();
        one.start();

    }
}

class MyTimeBombRunnable implements Runnable{

    public void run() {

        for (int x = 10; x > 0; x--) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + x);
                Thread.sleep(0);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }


        }
        System.out.println("Boom");

    }


        }
