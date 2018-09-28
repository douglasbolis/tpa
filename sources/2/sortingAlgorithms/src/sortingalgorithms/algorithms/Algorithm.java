/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.algorithms;

/**
 *
 * @author douglas
 */
public abstract class Algorithm {

    protected String id;
    
    protected Algorithm(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

}
