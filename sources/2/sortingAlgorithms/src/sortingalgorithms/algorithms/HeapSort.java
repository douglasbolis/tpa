/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.util.Comparator;

/**
 * Class HeapSort.
 *
 * @author douglas
 */
public class HeapSort<T> extends Algorithm<T> {

    public HeapSort() {
        super("heapsort");
    }

    @Override
    public void sort(T[] ts, Comparator<T> comp) {
        for (int j = 1; j < ts.length; j++) {
            int i = j - 1;

            while (i >= 0 && comp.compare(ts[i], ts[j]) > 0) {
                ts[i + 1] = ts[i];
                i--;
            }

            ts[i + 1] = ts[j];
        }
    }

}
