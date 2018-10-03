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
public class MergeSort<T> extends Algorithm<T> {

    public MergeSort() {
        super("mergesort");
    }

    @Override
    public void sort(List<T> ts, Comparator<? super T> comp) {
        this.mergeSort(ts, 0, ts.size(), comp);
    }

    private void mergeSort(List<T> ts, int first, int last, Comparator<? super T> comp) {
        if (first < last) {
            int half = (int) Math.ceil((first + last) / 2);
            this.mergeSort(ts, first, half, comp);
            this.mergeSort(ts, half + 1, last, comp);
            this.merge(ts, first, half, last, comp);
        }
    }

    private void merge(List<T> ts, int first, int half, int last, Comparator<? super T> comp) {
        List<T> left = super.copy(ts, first, half + 1);
        List<T> right = super.copy(ts, half, last);

        int i = 0;
        int j = 0;

        for (int k = first; k < last; k++) {
            T lt = left.get(i);
            T rt = right.get(j);

            if (lt != null && rt != null) {
                if (comp.compare(lt, rt) >= 0) {
                    ts.set(k, rt);
                    j++;
                } else {
                    ts.set(k, lt);
                    i++;
                }
            } else
            if (lt == null) {
                ts.set(k, rt);
                j++;
            } else {
                ts.set(k, lt);
                i++;
            }
        }
    }

}
