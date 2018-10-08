/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.util.Comparator;

/**
 * Classe QuickSort.
 *
 * @author douglas
 * @param <T>
 */
public class QuickSort<T> extends Algorithm<T> {

    public QuickSort() {
        super("quicksort");
    }

    @Override
    public void sort(T[] ts, Comparator<T> comp) {
        this.quickSort(ts, 0, ts.length - 1, comp);
    }

    /**
     * Realiza a ordenação dos elementos do vertor ts com o quicksort.
     *
     * @private
     * @param ts Vertor com os elementos.
     * @param lowerIndex Número do menor índice.
     * @param higherIndex Número do maior índice.
     * @param comp Função comparadora.
     */
    private void quickSort(T[] ts, int lowerIndex, int higherIndex, Comparator<T> comp) {

        if (lowerIndex < higherIndex) {
            int pivot = this.partition(ts, lowerIndex, higherIndex, comp);
            this.quickSort(ts, lowerIndex, pivot - 1, comp);
            this.quickSort(ts, pivot + 1, higherIndex, comp);
        }

    }

    /**
     * Realiza a partição do vetor ts e retorna o índice de partição.
     *
     * @private
     * @param ts Vetor com os elementos para a ordenação.
     * @param lowerIndex Número do menor índice.
     * @param higherIndex Número do maior índice.
     * @param comp Função comparadora.
     * @return
     */
    private int partition(T[] ts, int lowerIndex, int higherIndex, Comparator<T> comp) {

        T temporary, pivot = ts[lowerIndex];
        int i = lowerIndex + 1;
        int f = higherIndex;

        while (i <= f) {
            if (comp.compare(ts[i], pivot) <= 0) {
                // Realiza a troca de ts[i] com ts[j]
                i++;
            } else
            if (comp.compare(pivot, ts[f]) < 0) {
                f--;
            } else {
                temporary = ts[i];
                ts[i] = ts[f];
                ts[f] = temporary;
                i++;
                f--;
            }
        }

        // Realiza a troca de ts[i + 1] com ts[higerIndex]
        ts[lowerIndex] = ts[f];
        ts[f] = pivot;

        return f;

    }

}
