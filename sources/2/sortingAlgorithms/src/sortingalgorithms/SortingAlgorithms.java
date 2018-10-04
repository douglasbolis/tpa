/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.Comparator;
import java.util.Date;
import sortingalgorithms.algorithms.Algorithm;
import sortingalgorithms.algorithms.MergeSort;
import sortingalgorithms.data.Person;

/**
 * Class SortingAlgorithm.
 *
 * @author douglas
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Algorithm algorithm = new MergeSort();

        Person p1 = new Person("douglas@mail.com", 'm', "c", new Date(), 189, 82.0);
        Person p2 = new Person("maria@mail.com", 'f', "b", new Date(), 190, 85.0);
        Person p3 = new Person("pedro@mail.com", 'm', "a", new Date(), 175, 79.0);
        
        Person[] people = {p1, p2, p3};

        algorithm.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.getUid().compareTo(b.getUid());
            }
        });

        for (Person person : people) {
            System.out.println(person.getUid());
        }
    }
    
}
