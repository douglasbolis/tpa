/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.utils;

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
        return "file.csv";
    }

    /**
     * Calcula o número de linhas do arquivo csv.
     *
     * @return Número de linhas no arquivo de dados.
     */
    public Integer getNumberLines() {
        return 16;
    }

    /**
     * Reune o conteúdo do arquivo de dados.
     *
     * @return Vetor com o conteúdo do arquivo de dados.
     */
    public String[] getContent() {
        int numberLines = this.getNumberLines();
        String[] content = new String[numberLines];

        content[0] = "douglas@mail.com  ;m  ;c  ;2018-03-30 ;189    ;82.0";
        content[1] = "maria@mail.com    ;f  ;b  ;2018-03-30 ;190    ;85.0";
        content[2] = "pedro@mail.com    ;m  ;a  ;2018-03-30 ;175    ;79.0";
        content[3] = "joao@mail.com     ;m  ;f  ;2018-03-30 ;175    ;79.0";
        content[4] = "denis@mail.com    ;m  ;h  ;2018-03-30 ;175    ;79.0";
        content[5] = "rafael@mail.com   ;m  ;g  ;2018-03-30 ;175    ;79.0";
        content[6] = "mara@mail.com     ;f  ;i  ;2018-03-30 ;175    ;79.0";
        content[7] = "joana@mail.com    ;f  ;p  ;2018-03-30 ;175    ;79.0";
        content[8] = "helena@mail.com   ;f  ;k  ;2018-03-30 ;175    ;79.0";
        content[9] = "mario@mail.com    ;m  ;o  ;2018-03-30 ;175    ;79.0";
        content[10] = "diego@mail.com   ;m  ;n  ;2018-03-30 ;175    ;79.0";
        content[11] = "jonas@mail.com   ;m  ;m  ;2018-03-30 ;175    ;79.0";
        content[12] = "ana@mail.com     ;f  ;l  ;2018-03-30 ;175    ;79.0";
        content[13] = "mariano@mail.com ;m  ;e  ;2018-03-30 ;175    ;79.0";
        content[14] = "danilo@mail.com  ;m  ;j  ;2018-03-30 ;175    ;79.0";
        content[15] = "diana@mail.com   ;f  ;d  ;2018-03-30 ;175    ;79.0";

        return content;
    }

}
