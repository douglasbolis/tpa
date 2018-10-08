/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.data;

import java.time.LocalDate;

/**
 * Classe Person.
 *
 * @author douglas
 */
public class Person {

    private final String mail;
    private final char gender;
    private final String uid;
    private final LocalDate birthdate;
    private final Integer height;
    private final double weight;

    /**
     * Construtor Person que recebe os dados separados para a definição da pessoa.
     *
     * @param mail Email da pessoa.
     * @param gender Sexo da pessoa.
     * @param uid Uid da pessoa.
     * @param birthdate Data de nascimento da pessoa.
     * @param height Altura da pessoa.
     * @param weight Peso da pessoa.
     */
    public Person(String mail, char gender, String uid, LocalDate birthdate, Integer height, double weight) {
        this.mail = mail;
        this.gender = gender;
        this.uid = uid;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Construtor Person que recebe um vertor de objetos.
     *
     * @param person Vetor de objetos.
     */
    public Person(Object[] person) {
        this.mail = ((String) person[0]).trim();
        this.gender = ((String)person[1]).trim().charAt(0);
        this.uid = ((String) person[2]).trim();
        this.birthdate = LocalDate.parse(((String) person[3]).trim());
        this.height = Integer.parseInt(((String) person[4]).trim());
        this.weight = Double.parseDouble(((String) person[5]).trim());
    }

    /**
     * Retorna o email da pessoa.
     *
     * @return
     */
    public String getMail() {
        return mail;
    }

    /**
     * Retorna o sexo da pessoa.
     *
     * @return
     */
    public char getGender() {
        return gender;
    }

    /**
     * Retorna a uid da pessoa.
     *
     * @return
     */
    public String getUid() {
        return uid;
    }

    /**
     * Retorna da data de nascimento da pessoa.
     *
     * @return
     */
    public LocalDate getBirthdate() {
        return birthdate;
    }

    /**
     * Retorna a altura(cm) da pessoa.
     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Retorna o peso(kg) da pessoa.
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

}
