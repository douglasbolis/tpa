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
 * @param <T> Generic type.
 */
public abstract class Algorithm<T> {

    protected String id;
    
    protected Algorithm(String id) {
        this.id = id;
    }

    /**
     * Get the identification of the algorithm.
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Performs sort order on list according to method _c_.
     *
     * @param list
     * @param c
     */
    public abstract void sort(List<T> list, Comparator<? super T> c);

}
