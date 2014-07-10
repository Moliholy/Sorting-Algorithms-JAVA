/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umu.molina;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author MOLINA
 */
public class Tester {

    //for steps 1 and 2
    private int start;
    private int stop;
    private int rep;
    private int steps;
    private Sorter[] sorter;
    private Window window;
    //for step 3
    private int low;
    private int hi;
    private int num;

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHi() {
        return hi;
    }

    public void setHi(int hi) {
        this.hi = hi;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Tester() {
        start = 100;
        stop = 2000000;
        rep = 10;
        steps = 20;
        sorter = new Sorter[]{new Quicksorter()};
        window = new Window(this);
    }

    public Tester(int start, int stop, int rep, int steps, Sorter sorter) {
        this.start = start;
        this.stop = stop;
        this.rep = rep;
        this.steps = steps;
        this.sorter = new Sorter[]{sorter};
        this.window = new Window(this);
    }

    private int[][] initializeRandomArray() {
        Random random = new Random();
        int[][] arrays = new int[rep][];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = new int[stop];
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = Math.abs(random.nextInt());
            }
        }
        return arrays;
    }

    public String printResults(long[][] times) {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t");
        for (int i = 0; i < sorter.length; i++) {
            sb.append(sorter[i].getName()).append("\t");
        }

        for (int i = 0; i < times.length; i++) {
            int number = start + i * ((stop - start) / (steps - 1));
            sb.append("\n").append(number).append("\t\t");
            for (int j = 0; j < times[0].length; j++) {
                sb.append(times[i][j]).append("\t\t");
            }
        }
        return sb.toString();
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getStart() {
        return start;
    }

    public int getStop() {
        return stop;
    }

    public int getRep() {
        return rep;
    }

    public int getSteps() {
        return steps;
    }

    public Sorter[] getSorter() {
        return sorter;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public void setRep(int rep) {
        this.rep = rep;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setSorter(Sorter[] sorter) {
        this.sorter = sorter;
    }

    public long[][] runStep3() {
        if (sorter != null && start >= 0 && stop >= start && rep > 0 && steps > 1) {
            ThresholdQuicksorter pseudosorter = new ThresholdQuicksorter(0);
            Sorter mainSorter = new Quicksorter();
            int[][] arrays = initializeRandomArray();
            long[][] times = new long[steps][num];
            for (int k = 0; k < num; k++) {
                int threshold = low + k * ((hi - low) / (num - 1));
                pseudosorter.setThreshold(threshold);
                for (int i = 0; i < steps; i++) {
                    int limit = start + i * (stop - start) / (steps - 1);
                    int average = 0;
                    for (int j = 0; j < rep; j++) {
                        int[] arrayAlmostSorted = Arrays.copyOf(arrays[j], limit);
                        int[] copy = Arrays.copyOf(arrayAlmostSorted, limit);
                        pseudosorter.sort(arrayAlmostSorted, limit);

                        boolean istrue = Arrays.equals(copy, arrayAlmostSorted);
                        //System.arraycopy(arrayAlmostSorted, 0, array, 0, limit);
                        //System.out.println(Arrays.toString(array));

                        System.gc();//calling the garbage collector before the algorithm itself!
                        long startChronometer = System.nanoTime() / 1000;
                        mainSorter.sort(arrayAlmostSorted, limit);
                        long time = (System.nanoTime() / 1000) - startChronometer;
                        average += time;

                        //System.out.println(Arrays.toString(array) + "\n");
                    }
                    average /= rep;
                    times[i][k] = average;
                    //System.out.println("Times " + i + "-" + k + "    Average = " + average);
                }
            }
            return times;
        }
        return null;
    }

    public long[][] run() {
        if (sorter != null && start >= 0 && stop >= start && rep > 0 && steps > 1) {
            int[][] arrays = initializeRandomArray();
            long[][] times = new long[steps][sorter.length];
            for (int k = 0; k < sorter.length; k++) {
                for (int i = 0; i < steps; i++) {
                    int limit = start + i * (stop - start) / (steps - 1);
                    int average = 0;
                    int[] array = new int[limit];

                    for (int j = 0; j < rep; j++) {
                        System.arraycopy(arrays[j], 0, array, 0, limit);

                        //System.out.println(Arrays.toString(array));
                        System.gc();//calling the garbage collector before the algorithm itself!
                        long startChronometer = System.nanoTime() / 1000;
                        sorter[k].sort(array, limit);
                        long time = (System.nanoTime() / 1000) - startChronometer;
                        average += time;

                        //System.out.println(Arrays.toString(array) + "\n");
                    }
                    average /= rep;
                    times[i][k] = average;
                }
            }
            return times;
        }
        return null;
    }

    public void showInterface(boolean show) {
        window.setVisible(show);
    }

    public static void main(String ags[]) {
        //Tester tester = new Tester(9, 10, 2, 2, new Quicksorter());

        String so = System.getProperty("os.name");
        if (so.contains("Windows")) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            }
        }
        /*Tester tester = new Tester();
         tester.showInterface(true);*/
        /*
         Sorter[] algorithms = new Sorter[1];
         algorithms[0] = new Quicksorter();
         Tester tester = new Tester(10, 10, 10, 2, algorithms[0]);
         long[][] results;
         results = tester.run();
         String toPrint = tester.printResults(results);
         System.out.println(toPrint);*/

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Quicksorter sorter = new Quicksorter();

        long startChronometer = System.nanoTime() / 1000000;
        sorter.sort(array, array.length);
        long time = (System.nanoTime() / 1000000) - startChronometer;
        System.out.println(time + " miliseconds");
    }

    public String printResultsStep3(long[][] times) {
        StringBuilder sb = new StringBuilder();
        sb.append("Quicksort\t");
        for (int i = 0; i < num; i++) {
            int number = low + i * ((hi - low) / (num - 1));
            sb.append(number).append("\t\t");
        }

        for (int i = 0; i < times.length; i++) {
            sb.append("\n").append((start + i * (stop - start) / (steps - 1))).append("\t\t");
            for (int j = 0; j < times[0].length; j++) {
                sb.append(times[i][j]).append("\t\t");
            }
        }
        return sb.toString();
    }
}
