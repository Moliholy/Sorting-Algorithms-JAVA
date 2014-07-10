
package com.umu.molina;

/**
 *
 * @author MOLINA
 */
public abstract class Sorter {
    public abstract void sort(int[] arr, int last);
    protected String name;

    public String getName() {
        return name;
    }
}
