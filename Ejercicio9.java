import java.util.Scanner; 

 /** 

  * 

  * @author Carlos Daniel Valdivieso Vega   

  */ 
public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero, resultado;

        System.out.println("Ingrese un numero entero:");
        numero = leer.nextInt();

        for (int i = 1; i <= 12; i++) {
            resultado = numero * i;

            System.out.println(numero + " x " + i + " = " + resultado);
        }

        leer.close();
    }
}
