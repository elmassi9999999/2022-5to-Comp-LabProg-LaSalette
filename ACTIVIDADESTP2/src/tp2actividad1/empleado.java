/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2actividad1;

/**
 *
 * @author PC01
 */
public class empleado {
    
String apellido;

String nombre;

double sueldo;

public empleado( String nombre , String apellido , double sueldo )
{
    
this.nombre=nombre;
 
this.apellido=apellido;
 
if(sueldo>0){
    
this.sueldo=sueldo; 

}

}   
public double obtenersueldoanual ()
{
    return sueldo * 12;
}
public double obteneraumento ()
{
return obtenersueldoanual () * 1.10;
}
public void mostrarResumen()
{
    System.out.printf ("\nSu nombre es:%s", nombre);
    System.out.printf ("\nSu apellido es:%s", apellido);
    System.out.printf ("\nSu sueldo mesual es:%f", sueldo);
    System.out.printf ("\nSu sueldo anual es:%f", obtenersueldoanual ());
    System.out.printf ("\nSu salario anual con incremento es:%f",obteneraumento () );
}
}
