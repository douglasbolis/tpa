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
 */
public class HeapSort<T> extends Algorithm<T> {

    public HeapSort() {
        super("heapsort");
    }

    @Override
    public void sort(List<T> ts, Comparator<? super T> c) {
        for (int j = 1; j < ts.size(); j++) {
            T person = ts.get(j);
            int i = j - 1;

            while (i >= 0 && c.compare(ts.get(i), person) > 0) {
                ts.set(i + 1, ts.get(i));
                i--;
            }

            ts.set(i + 1, person);
        }
    }

}
