package l_2_17_3;

import java.util.Arrays;

public class MySumCountRunnable implements Runnable {

    int startindex;
    int stopindex;
    long resultSum = 0;
    int[] array;

    public MySumCountRunnable(int startindex,int stopindex,int [] array){
        this.startindex=startindex;
        this.stopindex=stopindex;
        this.array=array;
    }

    public long getResultSum() {
        return resultSum;
    }

    public int getStartindex() {
        return startindex;
    }

    public int getStopindex() {
        return stopindex;
    }

    public void setStartindex(int startindex) {
        this.startindex = startindex;
    }

    public void setStopindex(int stopindex) {
        this.stopindex = stopindex;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void run() {

        for (int x = startindex; x < stopindex; x++) {
            resultSum += array[x];
        }
        try {
            Thread.sleep(1);

            System.out.println(Arrays.toString(array));
            System.out.println(Thread.currentThread().getName() + "  Sum of the array is " + resultSum);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }


    }
}

