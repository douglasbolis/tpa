/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import sortingalgorithms.algorithms.Algorithm;
import sortingalgorithms.algorithms.HeapSort;

/**
 *
 * @author douglas
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Algorithm heap = new HeapSort();
        System.out.println(heap.getId());
    }
    
}
