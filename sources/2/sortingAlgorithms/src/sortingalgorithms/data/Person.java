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
public class Person {

    private String mail;
    private char gender;
    private String uid;
    private Date birthdate;
    private Integer height;
    private Integer weight;

    public Person(Person person) {
        mail = person.mail;
        gender = person.gender;
        uid = person.uid;
        birthdate = person.birthdate;
        height = person.height;
        weight = person.weight;
    }

    public String getMail() {
        return mail;
    }

    public char getGender() {
        return gender;
    }

    public String getUid() {
        return uid;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

}
