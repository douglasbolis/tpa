/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.util.Comparator;

/**
 * Classe HeapSort.
 *
 * @author douglas
 * @param <T>
 */
public class HeapSort<T> extends Algorithm<T> {

    public HeapSort() {
        super("heapsort");
    }

    @Override
    public void sort(T[] ts, Comparator<T> comp) {

        int n = ts.length;

        // Construindo o monte(rearranjendo o array).
        for (int i = n / 2 - 1; i >= 0; i--) {
            this.maxHeapify(ts, n, i, comp);
        }

        // Extraindo os elementos do monte uma a um.
        for (int i = n - 1; i >= 0; i--) {
            // Move o root atual para o fim do array.
            T temp = ts[0];
            ts[0] = ts[i];
            ts[i] = temp;

            this.maxHeapify(ts, i, 0, comp);
        }

    }

    /**
     * Obtém uma sub árvore com o root em i.
     *
     * @param ts Array com os elementos.
     * @param heapSize Tamanho do heap.
     * @param i Índice do array que será setado como root.
     * @param comp Função comparadora.
     */
    private void maxHeapify(T[] ts, Integer heapSize, Integer i, Comparator<T> comp) {

        // Inicia largest como root.
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Se o filho da esquerda é maior que o root.
        if (left < heapSize && comp.compare(ts[left], ts[largest]) > 0) {
            largest = left;
        }

        // Se o filho da direita é maior que largest.
        if (right < heapSize && comp.compare(ts[right], ts[largest]) > 0) {
            largest = right;
        }

        // Se largest não for o root.
        if (largest != i) {
            T temporary = ts[i];
            ts[i] = ts[largest];
            ts[largest] = temporary;

            this.maxHeapify(ts, heapSize, largest, comp);
        }
    }

}
