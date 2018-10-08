/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

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
        String sortingType = "mergesort";

        if (sortingType.equalsIgnoreCase("selectionsort")) {
            algorithm = new SelectionSort();
        } else if (sortingType.equalsIgnoreCase("insertionsort")) { // Implementação errada.
            algorithm = new InsertionSort();
        } else if (sortingType.equalsIgnoreCase("mergesort")) { // Implementação errada.
            algorithm = new MergeSort();
        } else if (sortingType.equalsIgnoreCase("quicksort")) {
            algorithm = new QuickSort();
        } else if (sortingType.equalsIgnoreCase("heapsort")) { // Implementação errada.
            algorithm = new HeapSort();
        }

        return algorithm;

    }

}
