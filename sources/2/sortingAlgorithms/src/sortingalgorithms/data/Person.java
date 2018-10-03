/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.data;

import java.util.Date;

/**
 *
 * @author douglas
 */
public class Person implements Cloneable {

    private final String mail;
    private final char gender;
    private final String uid;
    private final String birthdate;
    private final Integer height;
    private final double weight;

    public Person(String mail, char gender, String uid, String birthdate, Integer height, double weight) {
        this.mail = mail;
        this.gender = gender;
        this.uid = uid;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Get the mail from the person.
     *
     * @return
     */
    public String getMail() {
        return mail;
    }

    /**
     * Get the gender from the person.
     *
     * @return
     */
    public char getGender() {
        return gender;
    }

    /**
     * The the uid from the person.
     *
     * @return
     */
    public String getUid() {
        return uid;
    }

    /**
     * Get the birthdate from the person.
     *
     * @return
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Get the height from the person.
     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Get the weight from the person.
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

}
