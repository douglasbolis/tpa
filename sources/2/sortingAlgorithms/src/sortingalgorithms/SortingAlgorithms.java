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
        Algorithm algorithm = new SelectionSort();
        List<Person> list = new LinkedList();

        Person p1 = new Person("douglas@mail.com", 'm', "c", "2018", 189, 82.0);
        Person p2 = new Person("maria@mail.com", 'f', "b", "2018", 190, 85.0);
        Person p3 = new Person("pedro@mail.com", 'm', "a", "2018", 175, 79.0);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        algorithm.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.getHeight().compareTo(b.getHeight());
            }
        });

        for(Person person : list){
            System.out.println(person.getUid());
	}
    }
    
}
