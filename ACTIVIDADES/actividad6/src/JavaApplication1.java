import java.util.Scanner;

public class JavaApplication1 {

public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 int a = 0; 
 int b; 
 int i; 
a=(int) (Math.random() * 100)+1;
 System.out.println("juego de averiguar un número secreto");


 for (i=1; i<=10; i++) { 
    System.out.println ("ingrese un numero");
 
 b = sc.nextInt(); 

        if (a == b) {  
      System.out.println("you win"); 
      break; } 
    
    else if (a > b) 
      System.out.println("El número secreto es MAYOR que " + b);
    else if (a < b)
      System.out.println("El número secreto es MENOR que " + b);

   
           
    }
  }
}