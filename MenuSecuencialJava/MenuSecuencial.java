
import javax.swing.JOptionPane;
public class MenuSecuencial {
	public static void main (String[]args) {
	byte g;
		do{
		byte r=Byte.parseByte(JOptionPane.showInputDialog("seleccione un numero que decea ejecutar \n 1= calcular monto de becas \n 4 2=calcular sueldo total \n 
		3=calcular descuento del sueldo \n 4= invertir un numero de dos cifras \n 5=repartir monto a tres hermanos \n 6=invercionm de tres personas
		 \n 7=convertir grados celscius a farenheit \n 8= convertir pesos a dolares \n 9=porcentajes de alumnos de cada carrera \n 10= calcular sueldo extra"));
			//asi se crea un objeto
			switch(r){
			case 1: Ejercicio1 obj1 = new Ejercicio1();
				obj1.calcularMonto();
			break;
				
			case 2: Ejercicio2 obj2 = new Ejercicio2();
				obj2.calcularSueldo();
			break;
				
			case 3: Ejercicio3 obj3 = new Ejercicio3 ();
				obj3.calcularST();
			break;
				
			case 4: Ejercicio4 obj4 = new Ejercicio4();
				obj4.invertirNum();
			break;
				
			case 5: Ejercicio5 obj5 = new Ejercicio5();
				obj5.repartirMonto();
			break;
				
			case 6: Ejercicio6 obj6 = new Ejercicio6();
				obj6.invertir();
			break;
				
			case 7: Ejercicio7 obj7 = new Ejercicio7();
				obj7.convertirGrados();
			break;
				
			case 8: Ejercicio8 obj8 = new Ejercicio8();
				obj8.convertirDolar();
			break;
			
			case 9: Ejercicio9 obj9 = new Ejercicio9();
				obj9.calcularAlumnos();
			break;
			
			case 10: Ejercicio10 obj10 = new Ejercicio10();
				obj10.cobrarExtra();
			break;
			default:
				System.out.print("no hay ninhun programa con ese numero, verifique su numero");
			}
			g=Byte.parseByte(JOptionPane.showInputDialog("quieres volver a ejecutar un programa \n presiona 1 en caso de que si "));
		}while(g==1);
				
	}
		
			}