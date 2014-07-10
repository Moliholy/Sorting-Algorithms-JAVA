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
public class Javasorter extends Sorter {

    public Javasorter() {
        name = "Javasort";
    }

    @Override
    public void sort(int[] arr, int last) {
        Arrays.sort(arr, 0, last);
    }
}
