import java.util.Scanner; 

 /** 

  * 

  * @author Carlos Daniel Valdivieso Vega   

  */ 
public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero, mayor, menor;

        System.out.println("Ingrese el numero 1:");
        numero = leer.nextInt();

        mayor = numero;
        menor = numero;

        for (int i = 2; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ":");
            numero = leer.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        leer.close();
    }
}
