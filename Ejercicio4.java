import java.util.Scanner; 

 /** 

  * 

  * @author Carlos Daniel Valdivieso Vega   

  */  

 public class Ejercicio4 { 

       public static void main(String[] args) { 

        Scanner leer = new Scanner(System.in); 

        int nota;
        
        System.out.println("Escriba su nota:"); 
        nota = leer.nextInt();
        
        if (nota >= 7){
         System.out.println("Aprobado");
         
        } else {                   
         System.out.println("Reprobado");
        }
            leer.close();
        }
       }