/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.utils;

import sortingalgorithms.data.Person;

/**
 * Classe Utils.
 *
 * @author douglas
 */
public class Utils {

    /**
     * Converte o vetor de conteúdos para um vetor de pessoas.
     *
     * @param content
     * @return Vetor de pessoas.
     */
    public static Person[] convertToPerson(String[] content) {
        Integer numberPeople = content.length;
        Person[] people = new Person[numberPeople];
        
        for (int i = 0; i < numberPeople; i++) {
            Object[] person = content[i].split(";");
            people[i] = new Person(person);
        }

        return people;
    }

}
