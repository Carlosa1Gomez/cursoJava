// Calculadora de dos números por JOptionPane

import javax.swing.JOptionPane;

public class entradaJoption {

  public static void main(String[] args){

    int n1;
    int n2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int residuo;

    n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));

    suma = n1 + n2;
    resta = n1 - n2;
    multiplicacion = n1 * n2;
    division = n1 / n2;
    residuo = n1 % n2;

    JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + suma);
    JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + resta);
    JOptionPane.showMessageDialog(null, n1 + " * " + n2 + " = " + multiplicacion);
    JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + division);
    JOptionPane.showMessageDialog(null, "El residuo de la división es: " + residuo);
  }
}
