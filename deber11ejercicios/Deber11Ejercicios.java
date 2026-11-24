package deber11ejercicios; 

 import java.util.Scanner; 

 /** 

  * 

  * @author Carlos Daniel Valdivieso Vega   

  */  

 public class Deber11Ejercicios { 

       public static void main(String[] args) { 

        Scanner leer = new Scanner(System.in); 

        String nombre, carrera; 

        int edad;  

        double estatura;         

        System.out.println("Ingrese su nombre:"); 

        nombre = leer.nextLine();         

        System.out.println("Ingrese su edad:"); 

        edad = leer.nextInt(); 

        leer.nextLine(); 

        System.out.println("Ingrese su carrera:"); 

        carrera = leer.nextLine();        

        System.out.println("Ingrese su estatura:"); 

        estatura = leer.nextDouble();         

        System.out.println("--INGRESE SUS DATOS--"); 

        System.out.println("Nombre:" + nombre); 

        System.out.println("Edad:" + edad); 

        System.out.println("Carrera:" + carrera); 

        System.out.println("Estatura:" + estatura);         

        leer.close(); 

    } 

} 