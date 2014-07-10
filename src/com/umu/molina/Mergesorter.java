/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umu.molina;

import java.util.Arrays;

/**
 *
 * @author MOLINA
 */
public class Mergesorter extends Sorter {

    private int[] arr1;
    private int[] arr2;

    public Mergesorter() {
        name = "Mergesort";
        arr1 = arr2 = null;
    }

    @Override
    public void sort(int[] arr, int last) {
        arr1 = arr;
        arr2 = Arrays.copyOf(arr, last);
        mergesort1(0, last - 1);

        //free them for the garbage collector, we don't want to store large arrays needlessly
        arr1 = arr2 = null;
    }

    /**
     * Source: arr2 Destination: arr1
     *
     * @param first
     * @param last
     */
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
}
