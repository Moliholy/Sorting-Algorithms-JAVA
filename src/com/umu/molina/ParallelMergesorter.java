/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umu.molina;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MOLINA
 */
public class ParallelMergesorter extends Sorter {

    private int[] arr1;
    private int[] arr2;
    private static final Object LOCK = new Object();

    public ParallelMergesorter() {
        name = "PMergesort";
        arr1 = arr2 = null;
    }

    @Override
    public void sort(int[] arr, int last) {
        arr1 = arr;
        arr2 = Arrays.copyOf(arr, last);

        int middle = last / 2;

        InternalSorter thread1 = new InternalSorter(0, middle - 1);
        InternalSorter thread2 = new InternalSorter(middle, last - 1);
        thread1.start();
        thread2.start();

        while (thread1.finished == false || thread2.finished == false) {
            try {
                synchronized (LOCK) {
                    LOCK.wait();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(ParallelMergesorter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        merge(arr2, arr1, 0, last - 1);

        //free them for the garbage collector, we don't want to store large arrays needlessly
        arr1 = arr2 = null;
    }

    private void merge(int[] source, int[] destination, int first, int last) {
        int middle = (first + last) / 2;
        for (int u = first, i = first, j = middle + 1; u <= last; u++) {
            if (i <= middle && j <= last) {
                if (source[i] < source[j]) {
                    destination[u] = source[i++];
                } else {
                    destination[u] = source[j++];
                }
            } else if (i > middle) {
                destination[u] = source[j++];
            } else {
                destination[u] = source[i++];
            }
        }
    }

    private void mergesort1(int first, int last) {
        if (last - first <= 0) {
            return;
        }
        int middle = (last + first) / 2;
        mergesort2(first, middle);
        mergesort2(middle + 1, last);
        merge(arr2, arr1, first, last);
    }

    /**
     * Source: arr1 Destination: arr2
     *
     * @param first
     * @param last
     */
    private void mergesort2(int first, int last) {
        if (last - first <= 0) {
            return;
        }
        int middle = (last + first) / 2;
        mergesort1(first, middle);
        mergesort1(middle + 1, last);
        merge(arr1, arr2, first, last);
    }

    private class InternalSorter extends Thread {

        private int first;
        private int last;
        private boolean finished;

        public InternalSorter(int first, int last) {
            this.first = first;
            this.last = last;
            this.finished = false;
        }

        @Override
        public void run() {
            mergesort2(first, last);
            synchronized (LOCK) {
                finished = true;
                LOCK.notify();
            }
        }
    }
}
