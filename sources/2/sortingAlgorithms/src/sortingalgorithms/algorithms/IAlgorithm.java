/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.util.Comparator;

/**
 * Interface IAlgorithm.
 *
 * @author douglas
 * @param <T>
 */
public interface IAlgorithm<T> {

    public String getId();

    public abstract void sort(T[] ts, Comparator<T> comp);

}
