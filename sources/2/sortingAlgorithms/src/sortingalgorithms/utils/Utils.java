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
    public static Person[] stringToPerson(String[] content) {

        Integer numberPeople = content.length;
        Person[] people = new Person[numberPeople];

        for (int i = 0; i < numberPeople; i++) {
            Object[] person = content[i].split(",");
            people[i] = new Person(person);
        }

        return people;

    }

    /**
     * Converte o vetor de pessoas para um vetor de strings.
     *
     * @param content
     * @return Vetor de strings.
     */
    public static String[] personToString(Person[] content) {

        Integer numberStr = content.length;
        String[] str = new String[numberStr];

        for (int i = 0; i < numberStr; i++) {
            str[i] = ((Person) content[i]).toString();
        }

        return str;

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
            i++;
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

        String argSelected = null;
        int i = 0;

        while (argSelected == null && i < args.length) {
            if (args[i].equalsIgnoreCase(flag)) {
                argSelected = args[i + 1];
            } else if (args[i].contains("=")) {
                String[] params = args[i].split("=");
                if (params[0].equalsIgnoreCase(flag)) {
                    argSelected = params[1];
                }
            }
            i++;
        }

        return argSelected;

    }

}
