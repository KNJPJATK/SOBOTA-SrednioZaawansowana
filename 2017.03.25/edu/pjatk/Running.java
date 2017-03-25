/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pjatk;

/**
 *
 * @author procek69
 */
public class Running extends SportAbstract {

    @Override
    public void play() {
        System.out.println("Running");
    }

    @Override
    public String getDescription() {
        return "Go go go";
    }
    
}
