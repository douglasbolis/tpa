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
            Object[] person = content[i].split(",");
            people[i] = new Person(person);
        }

        return people;

    }

    /**
     * Busca o argumento desejado no vetor de argumentos.
     *
     * @param args
     * @param flags
     * @return
     */
    public static String getArgument(String[] args, String[] flags) {

        String flag = null;
        int i = 0;

        while (i < flags.length && flag == null) {
            flag = Utils.getArgument(args, flags[i]);
        }

        return flag;

    }

    /**
     * Busca o argumento desejado no vetor de argumentos.
     *
     * @param args
     * @param flag
     * @return
     */
    public static String getArgument(String[] args, String flag) {

        String filename = "/home/douglas/IFES/ifes_bsi/6_periodo/tpa/sources/2/sortingAlgorithms/data/trab2-data/data_10e5.csv";
        String sortname = "quicksort";

        if (flag.equalsIgnoreCase("filename") || flag.equalsIgnoreCase("f")) {
            return filename;
        } else if (flag.equalsIgnoreCase("algorithm") || flag.equalsIgnoreCase("a")) {
            return sortname;
        }

        return null;

    }

    /**
     * Imprime o resultado final do tempo de ordenação do dados.
     *
     * @param ident Identificador do algoritmo de ordenação.
     * @param numberElements Número de elementos ordenados.
     * @param diffenrece Tempo de execução em milissegundos.
     */
    public static void printFinalResult(String ident, Integer numberElements, long diffenrece) {
        System.out.println(String.format("%s\t%d\t%d", ident, numberElements, diffenrece));
    }

}
