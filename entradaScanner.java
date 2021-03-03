// Calculadora de dos números desde consola

import java.util.Scanner;

public class entradaScanner {

  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in) ;
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int residuo;

    System.out.println("Ingrese el primer número");
    numero1 = entrada.nextInt();

    System.out.println("Ingrese el segundo número");
    numero2 = entrada.nextInt();

    suma = numero1 + numero2;
    resta = numero1 - numero2;
    multiplicacion = numero1 * numero2;
    division = numero1 / numero2;
    residuo = numero1 % numero2;

    System.out.println(numero1 + " + " + numero2 + " = " + suma);
    System.out.println(numero1 + " - " + numero2 + " = " + resta);
    System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
    System.out.println(numero1 + " / " + numero2 + " = " + division);
    System.out.println("El residuo de la división es: " + residuo);

    entrada.close();
  }
}
