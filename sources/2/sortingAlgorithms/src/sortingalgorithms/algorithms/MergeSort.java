/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.lang.reflect.Array;
import java.util.Comparator;

/**
 * Classe MergeSort.
 *
 * @author douglas
 * @param <T>
 */
public class MergeSort<T> extends Algorithm<T> {

    public MergeSort() {
        super("mergesort");
    }

    @Override
    public void sort(T[] ts, Comparator<T> comp) {
        this.mergeSort(ts, 0, ts.length - 1, comp);
    }

    /**
     * Realiza a ordenação dos elementos do vertor ts com o mergeSort.
     *
     * @private
     * @param ts Vetor com os elementos para a ordenação.
     * @param lowerIndex Número do menor índice para a ordenação.
     * @param higherIndex Número do maior índice para a ordenação.
     * @param comp Função comparadora.
     * @return
     */
    private void mergeSort(T[] ts, int lowerIndex, int higherIndex, Comparator<T> comp) {

        if (lowerIndex < higherIndex) {
            int middleIndex = (lowerIndex + higherIndex) / 2;
            this.mergeSort(ts, lowerIndex, middleIndex, comp);
            this.mergeSort(ts, middleIndex + 1, higherIndex, comp);
            this.mergeParts(ts, lowerIndex, middleIndex, higherIndex, comp);
        }

    }

    /**
     * Realiza a comparação e merge dos elementos dos dois vetores.
     *
     * @private
     * @param ts Vetor com os elementos para a cópia.
     * @param lowerIndex Número do menor índice para a cópia.
     * @param higherIndex Número do maior índice para a cópia.
     * @param comp Função comparadora.
     * @return
     */
    private void mergeParts(T[] ts, int lowerIndex, int middleIndex, int higherIndex, Comparator<T> comp) {

        int n1 = middleIndex - lowerIndex + 1;
        int n2 = higherIndex - middleIndex;

        T[] leftT = (T[]) new Object[n1];
        T[] rightT = (T[]) new Object[n2];

        // Preenchendo o vetor da esquerda.
        for (int i = 0; i < n1; i++) {
            leftT[i] = ts[lowerIndex + i];
        }

        // Preenchendo o vetor da direita.
        for (int j = 0; j < n2; j++) {
            rightT[j] = ts[middleIndex + j + 1];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (comp.compare(leftT[i], rightT[j]) > 0) {
                ts[k] = rightT[j];
                j++;
            } else {
                ts[k] = leftT[i];
                i++;
            }
            k++;
        }

        // Percorrendo restante do vetor da esquerda.
        while (i < n1) {
            ts[k] = leftT[i];
            i++;
            k++;
        }

        // Percorrendo restante do vetor da direita.
        while (j < n2) {
            ts[k] = rightT[j];
            j++;
            k++;
        }

    }

}
