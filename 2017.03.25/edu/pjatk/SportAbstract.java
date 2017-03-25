/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pjatk;

/**
 *
 * @author procek69
 */
abstract public class SportAbstract implements Sport {
    @Override
    public String toString() {
        return this.getDescription();
    }

    abstract public String getDescription();
}
