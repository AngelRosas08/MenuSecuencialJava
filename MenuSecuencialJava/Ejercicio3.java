import javax.swing.JOptionPane;
public class Ejercicio3 {
	void calcularST (){
		float horas, tarifa, sueldoBruto, sueldoNeto;
		horas=Float.parseFloat(JOptionPane.showInputDialog("Ingrese sus horas por semana"));
		tarifa=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su tarifa por hora"));
		sueldoBruto=(float)(horas*tarifa);
		sueldoNeto=(float)(sueldoBruto-(sueldoBruto*0.12));
		JOptionPane.showMessageDialog(null,"Tu sueldo Bruto es de: $"+ sueldoBruto + "\n Tu sueldo Neto es de: $" + sueldoNeto);
	}
} 