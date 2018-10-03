/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author douglas
 * @param <T>
 */
public class SelectionSort<T> extends Algorithm<T> {

    public SelectionSort() {
        super("selectionsort");
    }

    @Override
    public void sort(List<T> ts, Comparator<? super T> c) {
        for (int j = 0; j < ts.size(); j++) {
            T person = ts.get(j);
            int k = j;

            for ( int i = k; i < ts.size(); i++) {
                T p2 = ts.get(i);
                int comp = c.compare(p2, person);
                if (comp < 0) {
                    k = i;
                    person = ts.get(i);
                }
            }

            ts.set(k, ts.get(j));
            ts.set(j, person);
        }
    }

}
