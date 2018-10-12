/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import sortingalgorithms.utils.Utils;

/**
 * Classe AlgorithmFactory para definir qual algoritmo de ordenação será
 * utilizado.
 *
 * @author douglas
 * @param <T>
 */
public class AlgorithmFactory<T> {

    /**
     * Seleciona o algoritmo de ordenação a ser utilizado.
     *
     * @param args Vetor com a lista de argumentos.
     * @return
     */
    public Algorithm<T> selectAlgorithm(String[] args) {

        Algorithm<T> algorithm = null;
        String[] flags = {"--algorithm", "-a"};
        String sortingType = Utils.getArgument(args, flags);

        if (sortingType.equalsIgnoreCase("selectionsort")) {
            algorithm = new SelectionSort();
        } else if (sortingType.equalsIgnoreCase("insertionsort")) {
            algorithm = new InsertionSort();
        } else if (sortingType.equalsIgnoreCase("mergesort")) {
            algorithm = new MergeSort();
        } else if (sortingType.equalsIgnoreCase("quicksort")) {
            algorithm = new QuickSort();
        } else if (sortingType.equalsIgnoreCase("heapsort")) {
            algorithm = new HeapSort();
        }

        return algorithm;

    }

}
