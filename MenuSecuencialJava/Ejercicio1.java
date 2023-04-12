import javax.swing.JOptionPane;   //Paquete

public class Ejercicio1 {   //Esta es una clase
	void calcularMonto(){   //Metodo Principal
		float inversion,sistemas,administracion,contabilidad,telecomunicaciones;//Declaracion de variables
		inversion=Float.parseFloat(JOptionPane.showInputDialog("Ingrese Beca"));//Solicitardato en ventana y captuar en convertir y capturar en inversion
		sistemas=(float)(inversion*0.2);
		administracion=(float)(inversion*0.3);
		contabilidad=(float)(inversion*0.25);
		telecomunicaciones=(float)(inversion-(sistemas+administracion+contabilidad));
		System.out.println("el monto para sistemas es: $"+ sistemas);
		System.out.println("el monto para Administracion es: $"+ administracion);
		System.out.println("el monto para Contabilidad es: $"+ contabilidad);
		System.out.println("el monto para telecomunicaciones es: $"+ telecomunicaciones);

	}//Cierra el metodo
}//cierra clase 