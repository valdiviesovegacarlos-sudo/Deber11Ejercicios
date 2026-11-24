import java.util.Scanner; 

 /** 

  * 

  * @author Carlos Daniel Valdivieso Vega   

  */  

 public class Ejercicio5 { 

       public static void main(String[] args) { 

        Scanner leer = new Scanner(System.in);
        
        double nota;
        
        System.out.println("Escriba su nota del 0 al 10:"); 
        nota = leer.nextDouble();
        
        if (nota < 0 || nota > 10) {
            System.out.println("Calificación fuera de rango.");
        } else if (nota >= 9){
         System.out.println("Excelente");        
        } else if (nota >= 8) {                   
         System.out.println("Muy Bueno");
        } else if (nota >= 7) {                   
         System.out.println("Bueno");
        } else if (nota >= 5) {                   
         System.out.println("Regular");
        } else if (nota >= 0) {                   
         System.out.println("Deficiente");
        }
        leer.close();
        }
       }