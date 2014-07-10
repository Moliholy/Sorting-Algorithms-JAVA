/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umu.molina;

/**
 *
 * @author MOLINA
 */
public class ThresholdQuicksorter extends Sorter {

    private int threshold;

    public ThresholdQuicksorter(int threshold) {
        this.name = "TQuicksort";
        this.threshold = threshold;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public void sort(int[] arr, int last) {
        modifiedQuicksort(arr, 0, last - 1);
    }

    private void modifiedQuicksort(int[] array, int from, int last) {
        int i = from, j = last;
        int pivot = array[from];
        while (i <= j) {
            while (array[i] < pivot && i < last) {
                ++i;
            }
            while (array[j] > pivot) {
                --j;
            }
            if (i <= j) {//new condition!
                if (pivot - array[j] >= threshold) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
                ++i;
                --j;
            }
        }
        if (from < j) {
            modifiedQuicksort(array, from, j);
        }
        if (last > i) {
            modifiedQuicksort(array, i, last);
        }
    }
}
