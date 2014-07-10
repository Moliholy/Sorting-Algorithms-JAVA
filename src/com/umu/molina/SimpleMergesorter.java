/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umu.molina;

/**
 *
 * @author MOLINA
 */
public class SimpleMergesorter extends Sorter {

    public SimpleMergesorter() {
        name = "SMergesort";
    }

    @Override
    public void sort(int[] arr, int last) {
        int[] sol = mergesort(arr, 0, last - 1);
        System.arraycopy(sol, 0, arr, 0, last);
    }

    private int[] mergesort(int v[], int first, int last) {
        if (last - first == 0) {
            return new int[]{v[first]};
        }
        int half = first + (-first + last) / 2;
        return merge(mergesort(v, first, half), mergesort(v, half + 1, last));
    }


    private int[] merge(int[] v1, int[] v2) {
        int[] toReturn = new int[v1.length + v2.length];
        for (int u = 0, i = 0, j = 0; u < toReturn.length; u++) {
            if (i < v1.length && j < v2.length) {
                if (v1[i] < v2[j]) {
                    toReturn[u] = v1[i++];
                } else {
                    toReturn[u] = v2[j++];
                }
            } else if (i >= v1.length) {
                toReturn[u] = v2[j++];
            } else {
                toReturn[u] = v1[i++];
            }
        }
        return toReturn;
    }
}
