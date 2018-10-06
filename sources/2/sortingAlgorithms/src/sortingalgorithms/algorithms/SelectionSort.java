/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.util.Comparator;

/**
 * Class SelectionSort.
 *
 * @author douglas
 * @param <T>
 */
public class SelectionSort<T> extends Algorithm<T> {

    public SelectionSort() {
        super("selectionsort");
    }

    @Override
    public void sort(T[] ts, Comparator<T> comp) {
        T temporary;
        int lowerIndex;

        for (int i = 0; i < ts.length - 1; i++) {
            lowerIndex = i;
            for (int j = i + 1; j < ts.length; j++) {
              if (comp.compare(ts[lowerIndex], ts[j]) > 0) {
                lowerIndex = j;
              }
            }

            temporary = ts[i];
            ts[i] = ts[lowerIndex];
            ts[lowerIndex] = temporary;
        }
    }

}
