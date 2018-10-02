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
public class MergeSort extends Algorithm<Person> {

    public MergeSort() {
        super("mergesort");
    }

    @Override
    public void sort(List<Person> list, Comparator<? super Person> c) {
        for (int j = 1; j < list.size(); j++) {
            Person person = list.get(j);
            int i = j - 1;

            while (i >= 0 && c.compare(list.get(i), person) > 0) {
                list.set(i + 1, list.get(i));
                i--;
            }

            list.set(i + 1, person);
        }
    }

}
