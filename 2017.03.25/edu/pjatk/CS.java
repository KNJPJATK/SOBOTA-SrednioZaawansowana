/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pjatk;

/**
 *
 * @author procek69
 */
public class CS extends SportAbstract {

    @Override
    public void play() {
         System.out.println("Shooting");
    }

    @Override
    public String getDescription() {
        return "Na A czy na B?";
    }
    
}
