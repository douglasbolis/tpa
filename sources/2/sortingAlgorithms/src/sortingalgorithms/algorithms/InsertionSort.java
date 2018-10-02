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
public class InsertionSort extends Algorithm<Person> {

    public InsertionSort() {
        super("insertionsort");
    }

    @Override
    public void sort(List<Person> people, Comparator<? super Person> c) {
        for (int j = 1; j < people.size(); j++) {
            Person person = people.get(j);
            int i = j - 1;

            while (i >= 0 && c.compare(people.get(i), person) > 0) {
                people.set(i + 1, people.get(i));
                i--;
            }

            people.set(i + 1, person);
        }
    }

}
