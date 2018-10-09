/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe CsvFile.
 *
 * @author douglas
 */
public class CsvFile {

    /**
     * Seleciona o nome do arquivo do vetor de argumentos.
     *
     * @param args
     * @return Nome do arquivo de dados.
     */
    public String getFilename(String[] args) {
        String[] flags = {"filename", "f"};
        return Utils.getArgument(args, flags);
    }

    /**
     * Calcula o número de linhas do arquivo csv.
     *
     * @param args
     * @return Número de linhas no arquivo de dados.
     */
    public Integer getNumberLines(String[] args) {
        String filename = this.getFilename(args);
        BufferedReader br = null;
        Integer numberLines = 0;
        String line = "";

        try {

            br = new BufferedReader(new FileReader(filename));
            for (numberLines = 0; (line = br.readLine()) != null; numberLines++) {
            }

        } catch (FileNotFoundException error) {
            error.printStackTrace();
        } catch (IOException error) {
            error.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException error) {
                    error.printStackTrace();
                }
            }
        }

        return numberLines;

    }

    /**
     * Reune o conteúdo do arquivo de dados.
     *
     * @param args
     * @return Vetor com o conteúdo do arquivo de dados.
     */
    public String[] getContent(String[] args) {
        String filename = this.getFilename(args);
        int numberLines = this.getNumberLines(args);
        String[] content = new String[numberLines];
        BufferedReader br = null;
        String line = "";
        int i = 0;

        try {

            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {

                content[i] = line;
                i++;

            }

        } catch (FileNotFoundException error) {
            error.printStackTrace();
        } catch (IOException error) {
            error.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException error) {
                    error.printStackTrace();
                }
            }
        }

        return content;

    }

}
