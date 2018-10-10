/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.util.Comparator;

/**
 * Classe InsertionSort.
 *
 * @author douglas
 * @param <T>
 */
public class InsertionSort<T> extends Algorithm<T> {

    public InsertionSort() {
        super("insertionsort");
    }

    @Override
    public void sort(T[] ts, Comparator<T> comp) {

        for (int i = 1; i < ts.length; ++i) {
            int j = i - 1;
            T key = ts[i];

            while (j >= 0 && comp.compare(ts[j], key) > 0) {
                ts[j + 1] = ts[j];
                j--;
            }

            ts[j + 1] = key;
        }

    }

}
