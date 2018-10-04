/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.data;

import java.util.Date;

/**
 * Class Person.
 *
 * @author douglas
 */
public class Person {

    private final String mail;
    private final char gender;
    private final String uid;
    private final Date birthdate;
    private final Integer height;
    private final double weight;

    public Person(String mail, char gender, String uid, Date birthdate, Integer height, double weight) {
        this.mail = mail;
        this.gender = gender;
        this.uid = uid;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
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
    public Date getBirthdate() {
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
