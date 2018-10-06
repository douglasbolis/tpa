/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.util.Comparator;

/**
 * Class Algorithm.
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
     * Realiza a ordenação dos elementos do vetor ts utilizando comparador comp.
     *
     * @param ts Vertor com os elementos.
     * @param comp Função comparadora.
     */
    @Override
    public abstract void sort(T[] ts, Comparator<T> comp);

}
