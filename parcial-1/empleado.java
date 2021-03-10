import javax.swing.JOptionPane;

/**
* empleado
*/
public class empleado {

  public String nombre;
  public int sueldoMensual;
  public int antiguedad;
  private int documentoIdentidad;

  empleado(){

    nombre = "";
    sueldoMensual = 0;
    antiguedad = 0;
    documentoIdentidad = 0;

  }

  empleado(String n, int s, int a, int d){

    nombre = n;
    sueldoMensual = s;
    antiguedad = a;
    documentoIdentidad = d;

  }

  public void setDocumento (int documentoIdentidad){

    this.documentoIdentidad = documentoIdentidad;

  }

  public int getDocumento (){

    return this.documentoIdentidad;
  }

  public static int valorPago (int sueldoMensual, int antiguedad) {

    int porcentaje, sueldoFinal;
    
    if (antiguedad <= 5) {
      
      porcentaje = (sueldoMensual * 10) / 100;

      sueldoFinal = porcentaje + sueldoMensual;
    	
    } else if (antiguedad > 5 && antiguedad < 10) {
    	
      porcentaje = (sueldoMensual * 15) / 100;

      sueldoFinal = porcentaje + sueldoMensual;

    } else {

      porcentaje = (sueldoMensual * 20) / 100;

      sueldoFinal = porcentaje + sueldoMensual;

    }

    return sueldoFinal;
  }

  public static void main(String[] args){

    empleado nuevoEmpleado = new empleado("Carlos", 1000000, 9, 1005464843);

    JOptionPane.showMessageDialog(null, "Hola " + nuevoEmpleado.nombre + " su documento es " + nuevoEmpleado.getDocumento() + " su sueldo es de " + nuevoEmpleado.sueldoMensual + " y lleva " + nuevoEmpleado.antiguedad + " años en la empresa");

    JOptionPane.showMessageDialog(null, "Por lo tanto el sueldo sumado con la bonificacion es de " + valorPago(nuevoEmpleado.sueldoMensual, nuevoEmpleado.antiguedad));

  }

}
