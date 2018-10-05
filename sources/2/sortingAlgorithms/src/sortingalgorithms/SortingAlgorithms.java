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
import sortingalgorithms.algorithms.QuickSort;
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

        Algorithm algorithm = new QuickSort();

        Person p1 = new Person("douglas@mail.com", 'm', "c", new Date(), 189, 82.0);
        Person p2 = new Person("maria@mail.com", 'f', "b", new Date(), 190, 85.0);
        Person p3 = new Person("pedro@mail.com", 'm', "a", new Date(), 175, 79.0);
        Person p4 = new Person("joao@mail.com", 'm', "f", new Date(), 175, 79.0);
        Person p5 = new Person("denis@mail.com", 'm', "h", new Date(), 175, 79.0);
        Person p6 = new Person("rafael@mail.com", 'm', "r", new Date(), 175, 79.0);
        Person p7 = new Person("mara@mail.com", 'f', "a", new Date(), 175, 79.0);
        Person p8 = new Person("joana@mail.com", 'f', "c", new Date(), 175, 79.0);
        Person p9 = new Person("helena@mail.com", 'f', "u", new Date(), 175, 79.0);
        Person p10 = new Person("mario@mail.com", 'm', "i", new Date(), 175, 79.0);
        Person p11 = new Person("diego@mail.com", 'm', "o", new Date(), 175, 79.0);
        Person p12 = new Person("jonas@mail.com", 'm', "q", new Date(), 175, 79.0);
        Person p13 = new Person("ana@mail.com", 'f', "w", new Date(), 175, 79.0);
        Person p14 = new Person("mariano@mail.com", 'm', "e", new Date(), 175, 79.0);
        Person p15 = new Person("danilo@mail.com", 'm', "m", new Date(), 175, 79.0);
        Person p16 = new Person("diana@mail.com", 'f', "v", new Date(), 175, 79.0);

        Person[] people = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16};

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
