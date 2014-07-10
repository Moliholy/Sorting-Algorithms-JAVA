package com.umu.molina;

/**
 *
 * @author MOLINA
 */
public class Hybridsorter extends Sorter {

    private int threshold;

    public Hybridsorter(int threshold) {
        this.threshold = Math.abs(threshold);
        name = "HybridSorter";
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

    private static void insertionSort(int v[], int from, int last) {
        for (int j, i = from + 1; i < last; ++i) {
            int aux = v[i];
            for (j = i; j > 0 && aux < v[j - 1]; --j) {
                v[j] = v[j - 1];
            }
            v[j] = aux;
        }
    }

    private void modifiedQuicksort(int[] array, int from, int last) {
        int i = from, j = last;
        int pivot = array[from];
        while (i <= j) {
            while (array[i] < pivot) {
                ++i;
            }
            while (array[j] > pivot) {
                --j;
            }
            if (i <= j) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                ++i;
                --j;
            }
        }
        if (from < j) {
            if (j - from > threshold) {
                modifiedQuicksort(array, from, j);
            } else {
                insertionSort(array, from, j);
            }
        }
        if (last > i) {
            if (last - i > threshold) {
                modifiedQuicksort(array, i, last);
            } else {
                insertionSort(array, i, last);
            }
        }
    }
}
