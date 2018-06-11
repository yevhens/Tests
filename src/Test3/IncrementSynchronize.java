package lab2_17.Test3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class IncrementSynchronize {

    private int value = 0;
    private Object lock = new Object();


    public synchronized void getNextValue() {
        value++;
    }

    public void getNextValue2() {
        synchronized (lock) {
            value++;
        }

    }
        public int getNextValue3() {
            synchronized (this) {
                return value++;
            }
        }


    }

