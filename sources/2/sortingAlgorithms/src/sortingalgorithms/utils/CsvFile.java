/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
    public String getInputFilename(String[] args) {
        String[] flags = {"--input", "-i"};
        return Utils.getArgument(args, flags);
    }

    /**
     * Seleciona o nome do arquivo do vetor de argumentos.
     *
     * @param args
     * @return Nome do arquivo de dados.
     */
    public String getOutputFilename(String[] args) {
        String[] flags = {"--output", "-o"};
        return Utils.getArgument(args, flags);
    }

    /**
     * Calcula o número de linhas do arquivo csv.
     *
     * @param filename
     * @return Número de linhas no arquivo de dados.
     */
    public Integer getNumberLines(String filename) {

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

        return numberLines - 1;

    }

    /**
     * Reune o conteúdo do arquivo de dados.
     *
     * @param filename
     * @param numberLines
     * @return Vetor com o conteúdo do arquivo de dados.
     */
    public String[] getContent(String filename, int numberLines) {

        String[] content = new String[numberLines];
        BufferedReader br = null;
        int i = 0;

        try {

            br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            // Ignorando o cabeçalho(nome das colunas).
            line = br.readLine();

            while (line != null) {

                content[i] = line;
                i++;
                line = br.readLine();

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
    
    /**
     * Escreve os dados ordenados no arquivo de saída.
     *
     * @param filename
     * @param content
     */
    public void setContent(String filename, String[] content) {

        BufferedWriter bw = null;

        try {

            bw = new BufferedWriter(new FileWriter(filename));

            for (String line : content) {
                bw.write(line);
            }

            bw.flush();
            
        } catch (FileNotFoundException error) {
            error.printStackTrace();
        } catch (IOException error) {
            error.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException error) {
                    error.printStackTrace();
                }
            }
        }

    }

}
