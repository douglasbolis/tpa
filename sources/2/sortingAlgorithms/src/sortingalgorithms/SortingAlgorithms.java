/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import sortingalgorithms.algorithms.Algorithm;
import sortingalgorithms.algorithms.AlgorithmFactory;
import sortingalgorithms.data.Person;
import sortingalgorithms.utils.CsvFile;
import sortingalgorithms.utils.Utils;

/**
 * Classe SortingAlgorithm.
 *
 * @author douglas
 */
public class SortingAlgorithms {

    /**
     * Método principal.
     *
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        for (String arg : args) {
            System.out.println(arg);
        }

        CsvFile csvFile = new CsvFile();
        AlgorithmFactory<Person> algorithmFactory = new AlgorithmFactory<>();
        Algorithm<Person> algorithm = algorithmFactory.selectAlgorithm(args);
        
        if (algorithm == null) {
            throw new Exception("Algoritmo não definido.");
        }
        
        Integer numberLines = csvFile.getNumberLines(args);

        String[] content = csvFile.getContent(args);

        Person[] people = Utils.convertToPerson(content);

        algorithm.sort(people, (a, b) -> a.getUid().compareTo(b.getUid()));

        for (Person person : people) {
            System.out.println(person.getUid());
        }

    }

}
