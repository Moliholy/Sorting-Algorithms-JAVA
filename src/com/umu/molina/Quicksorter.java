/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umu.molina;

/**
 *
 * @author MOLINA
 */
public class Quicksorter extends Sorter {

    private int numberOfIncrementsI;
    private int numberOfIncrementsJ;
    private int numberOfCallsToQuicksort;
    private int numberOfSwaps;

    public Quicksorter() {
        name = "Quicksort";
    }

    @Override
    public void sort(int[] arr, int last) {
        numberOfCallsToQuicksort = numberOfIncrementsI
                = numberOfIncrementsJ = numberOfSwaps = 0;
        quicksort(arr, 0, last - 1);
        System.out.println("Calls to Quicksort = " + numberOfCallsToQuicksort);
        System.out.println("Increments of i = " + numberOfIncrementsI);
        System.out.println("Increments of j = " + numberOfIncrementsJ);
        System.out.println("Number of swaps = " + numberOfSwaps);
    }

    private void quicksort(int[] array, int from, int last) {
        ++numberOfCallsToQuicksort;
        int i = from, j = last;
        int middle = (last + from) / 2;
        int pivot = array[middle];
        while (i <= j) {
            while (array[i] < pivot) {
                ++numberOfIncrementsI;
                ++i;
            }
            while (array[j] > pivot) {
                ++numberOfIncrementsJ;
                --j;
            }
            if (i <= j) {
                ++numberOfSwaps;
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                ++i;
                --j;
            }
        }
        if (from < j) {
            quicksort(array, from, j);
        }
        if (last > i) {
            quicksort(array, i, last);
        }
    }
}
