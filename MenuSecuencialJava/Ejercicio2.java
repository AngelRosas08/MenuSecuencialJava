import javax.swing.JOptionPane;
public class Ejercicio2 {
	void calcularSueldo() {
           float sueldo, ventas, comision, sueldoMensual, totalPersepciones;
           sueldo=Float.parseFloat(JOptionPane.showInputDialog("ingrese su sueldo quincenal"));
           ventas=Float.parseFloat(JOptionPane.showInputDialog("ingrese sus ventas mensuales"));
           sueldoMensual=(float)(sueldo*2);
           comision=(float)(ventas*0.10);
           totalPersepciones=(float)(sueldoMensual + comision);
           JOptionPane.showMessageDialog(null, " El trabajador percibe un sueldo mensual de $" + sueldoMensual + "\n Las comisiones por ventas son $ " + comision + "\n Total de persepciones $" + totalPersepciones);
     }
}