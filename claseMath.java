import javax.swing.JOptionPane;

/**
 * claseMath
 */
public class claseMath {

  public static void main(String[] args){

    double raiz = Math.sqrt(9);
    double potencia = Math.pow(2, 8);
    int redondeo = Math.round(12.8f);
    double aleatorio = Math.random() * 20;

    JOptionPane.showMessageDialog(null, "La raiz es: " + raiz);
    JOptionPane.showMessageDialog(null, "La potencia es: " + potencia);
    JOptionPane.showMessageDialog(null, "El redondeo es: " + redondeo);
    JOptionPane.showMessageDialog(null, "El número random es: " + aleatorio);
  }

}
