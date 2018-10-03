/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import sortingalgorithms.algorithms.Algorithm;
import sortingalgorithms.algorithms.HeapSort;
import sortingalgorithms.algorithms.InsertionSort;
import sortingalgorithms.algorithms.MergeSort;
import sortingalgorithms.algorithms.SelectionSort;
import sortingalgorithms.data.Person;

/**
 *
 * @author douglas
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Algorithm algorithm = new MergeSort<Integer>();
        List<Integer> list = new LinkedList();

//        Person p1 = new Person("douglas@mail.com", 'm', "c", "2018", 189, 82.0);
//        Person p2 = new Person("maria@mail.com", 'f', "b", "2018", 190, 85.0);
//        Person p3 = new Person("pedro@mail.com", 'm', "a", "2018", 175, 79.0);

        list.add(3);
        list.add(2);
        list.add(1);

//        algorithm.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person a, Person b) {
//                return a.getHeight().compareTo(b.getHeight());
//            }
//        });

        algorithm.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        });

        list.forEach((Integer person) -> {
            System.out.println(person);
        });
    }
    
}
