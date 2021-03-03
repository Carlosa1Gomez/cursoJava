import javax.swing.JOptionPane;

public class condicional {

  public static void main(String[] args){

    boolean casado = true;
    int numero = 4;

    if (numero <= 10){

      JOptionPane.showMessageDialog(null, "El número es menor o igual a 10");

    }else{

      JOptionPane.showMessageDialog(null, "El número no es menor ni igual a 10");

    }

    switch (numero){

      case 1: JOptionPane.showMessageDialog(null, "Número 1"); break;

      case 2: JOptionPane.showMessageDialog(null, "Número 2"); break;

      case 3: JOptionPane.showMessageDialog(null, "Número 3"); break;

      default: JOptionPane.showMessageDialog(null, "Número desconocido"); break;

    }
  }
}
