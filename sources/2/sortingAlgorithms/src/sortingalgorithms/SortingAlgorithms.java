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

        // Instanciando a classe de manipulação de arquivos csv.
        CsvFile csvFile = new CsvFile();

        // Selecionando o algoritmo de ordenação a ser utilizado.
        AlgorithmFactory<Person> algorithmFactory = new AlgorithmFactory<>();
        Algorithm<Person> algorithm = algorithmFactory.selectAlgorithm(args);
        
        // Selecionando os arquivos de entrada e saída.
        String inputFile = csvFile.getInputFilename(args);
        String outputFile = csvFile.getOutputFilename(args);

        if (algorithm == null) {
            throw new Exception("Algoritmo não definido.");
        }

        if (inputFile == null) {
            throw new Exception("Arquivo de dados não definido.");
        }

        if (outputFile == null) {
            throw new Exception("Arquivo de saída não definido.");
        }

        // Montando array de pessoas com base nos dados do arquivo csv disponibilizado.
        Integer numberLines = csvFile.getNumberLines(inputFile);
        String[] content = csvFile.getContent(inputFile, numberLines);
        Person[] people = Utils.stringToPerson(content);

        // Pegando o tempo inicial da execução.
        long initialTemp = System.currentTimeMillis();
        // Ordenando vetor.
        algorithm.sort(people, (a, b) -> a.getUid().compareTo(b.getUid()));
        // Pegando o tempo final da execução.
        long finalTemp = System.currentTimeMillis();

        // Imprimindo resultado final.
        Utils.printFinalResult(algorithm.getId(), content.length, finalTemp - initialTemp);

//        // Escrevendo dados ordenados no arquivo de saída.
//        content = Utils.personToString(people);
//        csvFile.setContent(outputFile, content);

    }

}
