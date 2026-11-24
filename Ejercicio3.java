import java.util.Scanner; 

 /** 

  * 

  * @author Carlos Daniel Valdivieso Vega   

  */  

 public class Ejercicio3 { 

       public static void main(String[] args) { 

        Scanner leer = new Scanner(System.in); 

        int edad;
        
        System.out.println("Escriba su edad:"); 
        edad = leer.nextInt();
        
        if (edad >= 18){
         System.out.println("Mayor de edad");
         
        } else {                   
         System.out.println("Menor de edad");
        }
            leer.close();
        }
       }