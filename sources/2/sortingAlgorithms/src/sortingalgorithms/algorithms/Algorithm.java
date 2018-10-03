/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author douglas
 * @param <T> Generic type.
 */
public abstract class Algorithm<T> implements IAlgorithm<T> {

    protected String id;

    protected Algorithm(String id) {
        this.id = id;
    }

    /**
     * Get the identification of the algorithm.
     *
     * @return
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Performs sort order on people according to method _c_.
     *
     * @param people List of people.
     * @param comp
     */
    @Override
    public abstract void sort(List<T> people, Comparator<? super T> comp);

    /**
     * Copy and return a new list of t.
     *
     * @param ts List of t.
     * @param first Number of the first item in the list.
     * @param last Number of the last item in the list.
     * @return
     */
    @Override
    public List<T> copy(List<T> ts, int first, int last) {
        List<T> copy = new LinkedList();

        for ( int i = first; i < last; i++) {
            copy.add(ts.get(i));
        }

        copy.add(null);

        return copy;
    }

}
