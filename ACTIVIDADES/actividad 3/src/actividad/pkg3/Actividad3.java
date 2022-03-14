/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg3;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int n2=1;
        int fac=1; 
 System.out.println ("hola");
 Scanner sc = new Scanner (System.in);
 System.out.println ("ingrese un numero");
 n=sc.nextInt();
 for (int i=1;i<=n;i++){
     fac=i*fac;
 }System.out.println ("el resultado del factorial es"+fac);
    
    
    
    
    }
    
    
    
    
}
