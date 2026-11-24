import java.util.Scanner; 

 /** 

  * 

  * @author Carlos Daniel Valdivieso Vega   

  */  

 public class Ejercicio2 { 

       public static void main(String[] args) { 

        Scanner leer = new Scanner(System.in); 
        
        int num1, num2;
        int suma, resta, multiplicacion, residuo;
        double division;
        
        System.out.println("Ingrese primer numero:"); 
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero:"); 
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        residuo = num1 % num2;
        
        System.out.println("Resultado de la suma:" + suma); 
 
        System.out.println("Resultado de la resta:" + resta); 
        
        System.out.println("Resultado de la multiplicacion:" + multiplicacion); 
        
        if (num2 != 0) {

            division = (double) num1 / num2;
            residuo = num1 % num2;
          
            System.out.println("Resultado de la division:" + division);
            System.out.println("Resultado del residuo:" + residuo);
            
        } else {
            System.out.println("No se puede dividir para cero");
        } 
            leer.close(); 
        }
       }