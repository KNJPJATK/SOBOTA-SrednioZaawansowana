/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pjatk;

/**
 *
 * @author procek69
 */
public class A {
    private void x() {
        System.out.println("sdfgag");
    };
    protected void do_x() {
        this.x();
    }
}


class B extends A {
    
    private void x() {

        System.out.println("425346");
    };
    
    B() {
        this.do_x();
    }
}
