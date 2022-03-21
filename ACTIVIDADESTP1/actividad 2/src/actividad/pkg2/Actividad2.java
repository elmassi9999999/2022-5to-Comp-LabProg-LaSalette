/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg2;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println ("hola");
       Scanner sc = new Scanner (System.in);
     System.out.println ("introdusca un año");
   int ano=sc.nextInt();
    if (ano%4==0){
    if (ano%100==0){
    if (ano%400!=0){
        System.out.println("el año no es biciesto");
    }
    }
        System.out.println("el año si es biciesto");
    }else{ 
        System.out.println("el año no es biciesto");
    }
    

    }
 
    }
