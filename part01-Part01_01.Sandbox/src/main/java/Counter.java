/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Counter {
     private int value;
 
    public Counter(int value) {
        this.value = value;
    }

    public void changeValue(int modifier) {
        this.value = this.value - modifier;
    }

    public int getValue() {
        return value;
    }

    
}
