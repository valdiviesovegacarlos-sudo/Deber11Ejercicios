import java.util.Scanner; 

 /** 

  * 

  * @author Carlos Daniel Valdivieso Vega   

  */  

 public class Ejercicio8 {

       public static void main(String[] args) { 

        Scanner leer = new Scanner(System.in);
        
        String contrasena;
        
        do {
            System.out.println("Ingrese la contrasenia:");
            contrasena = leer.nextLine();
            
        } while (!contrasena.equals("java2026"));
        
        System.out.println("Acceso concedido");
    }
 }       