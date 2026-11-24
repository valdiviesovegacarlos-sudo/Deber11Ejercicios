import java.util.Scanner; 

 /** 

  * 

  * @author Carlos Daniel Valdivieso Vega   

  */  

 public class Ejercicio7 {

       public static void main(String[] args) { 

        Scanner leer = new Scanner(System.in);
        
        int numero, suma = 0, cantidad = 0;

        System.out.println("Ingrese un numero positivo:");
        numero = leer.nextInt();

        while (numero >= 0) {
            suma = suma + numero;
            cantidad = cantidad + 1;

            System.out.println("Ingrese otro numero (negativo para terminar):");
            numero = leer.nextInt();
        }

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

        leer.close();
    }
}