/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("ingre un radio");
    int radio;
    Scanner s=new Scanner(System.in);
    radio=s.nextInt();
        int diametro = radio*2;
        System.out.println("el diametro es"+diametro);
    }
    
}
