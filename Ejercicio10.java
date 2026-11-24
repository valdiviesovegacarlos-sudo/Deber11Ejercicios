import java.util.Scanner; 

 /** 

  * 

  * @author Carlos Daniel Valdivieso Vega   

  */ 
public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero, suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ":");
            numero = leer.nextInt();

            suma = suma + numero;
        }

        promedio = (double) suma / 10;

        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);

        leer.close();
    }
}
