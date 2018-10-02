/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

import java.util.Comparator;
import java.util.List;
import sortingalgorithms.data.Person;

/**
 *
 * @author douglas
 */
public class SelectionSort extends Algorithm<Person> {

    public SelectionSort() {
        super("selectionsort");
    }

    @Override
    public void sort(List<Person> people, Comparator<? super Person> c) {
        for (int j = 0; j < people.size(); j++) {
            Person person = people.get(j);
            int k = j;

            for ( int i = k; i < people.size(); i++) {
                Person p2 = people.get(i);
                int comp = c.compare(p2, person);
                if (comp < 0) {
                    k = i;
                    person = people.get(i);
                }
            }

            people.set(k, people.get(j));
            people.set(j, person);
        }
    }

}
