/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pjatk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author procek69
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Sport> sports = new ArrayList<>();
        sports.add(new Running());
        sports.add(new Running());
        sports.add(new CS());
        sports.add(new CS());
        sports.add(new Jogging());
        sports.add(new SportAbstract() {

            @Override
            public String getDescription() {
                return "Hacking";
            }

            @Override
            public void play() {
                System.out.println("Connect to sdkp");
            }
        
        });
        //sports.add(new SportAbstract()); nie wolno!
        
        for (Sport s : sports) {
            
            //if (s.getClass().getName().equals("edu.pjatk.Running")) {
            if (s instanceof Running) {
                System.out.println("Water maybe? Now only 9.99$");
            }
            if (s instanceof Jogging) {
                System.out.println("Beer maybe? Now only 4.99$");
            }
            s.play();
        }
        
        
        lambda(() -> {
                System.out.println("Hello, lambda!");
        });
        
    }
    
    public static void lambda(Runnable r) {
        r.run();
    }
    
}
