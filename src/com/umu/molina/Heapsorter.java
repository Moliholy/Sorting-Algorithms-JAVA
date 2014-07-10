/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umu.molina;

/**
 *
 * @author MOLINA
 */
public class Heapsorter extends Sorter {

    public Heapsorter() {
        name = "Heapsort";
    }

    @Override
    public void sort(int[] array, int last) {
        insert(array, last);
        extract(array, last);
    }

    private void extract(int[] array, int last) {
        for (int i = last - 1; i > 0; i--) {
            int value = array[i];
            array[i] = array[0];
            array[0] = value;

            int root = 0;
            int child1 = 1;
            int child2 = 2;
            while (child2 < i) {
                int child = array[child1] > array[child2] ? child1 : child2;
                if (array[child] > value) {
                    array[root] = array[child];

                    root = child;
                    child1 = 2 * root + 1;
                    child2 = child1 + 1;
                } else {
                    break;
                }
            }
            if (child2 == i && array[child1] > value) {
                array[root] = array[child1];
                root = child1;
            }
            array[root] = value;
        }
    }

    private void insert(int[] array, int last) {
        for (int i = 1; i < last; i++) {
            int son = i;
            int father = son % 2 != 0 ? (son - 1) / 2 : (son - 2) / 2;
            while (son > 0 && array[father] < array[son]) {
                int aux = array[father];
                array[father] = array[son];
                array[son] = aux;
                son = father;
                father = son % 2 != 0 ? (son - 1) / 2 : (son - 2) / 2;
            }
        }
    }
}
