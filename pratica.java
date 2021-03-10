import javax.swing.JOptionPane;

/**
* practica
*/
public class pratica {

	public static void main(String[] args){

	  int n1, n2;

	  n1 = Integer.parseInt(JOptionPane.showInputDialog("Hola, ingresa el primer número"));
	  n2 = Integer.parseInt(JOptionPane.showInputDialog("Hola, ingresa el segundo número"));

	  if (n1 > n2) {

	 
	  } else {

	    JOptionPane.showMessageDialog(null, "Los números ordenados quedan: " + n2 + " " + n1);

	  }

	}
}
