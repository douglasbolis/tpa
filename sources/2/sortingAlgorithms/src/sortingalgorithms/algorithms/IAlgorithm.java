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
public interface IAlgorithm<T> {

    public String getId();

    public abstract void sort(List<T> people, Comparator<? super T> c);

    public List<T> copy(List<T> people, int fisrt, int last);

}
