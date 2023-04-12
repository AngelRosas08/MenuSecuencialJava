import javax.swing.JOptionPane;
public class Ejercicio9 {
	void calcularAlumnos (){
		float aluMate, aluRedes, aluTaller, aluProgramacion, totAlu, porRedes,porMate,porTaller, porProgramacion;
		aluMate=Float.parseFloat(JOptionPane.showInputDialog("Ingrese Cantidad de Alumnos de Matemáticas"));
		aluRedes=Float.parseFloat(JOptionPane.showInputDialog("Ingrese Cantidad de Alumnos de Redes"));
		aluTaller=Float.parseFloat(JOptionPane.showInputDialog("Ingrese Cantidad de Alumnos de Taller de Base de Datos"));
		aluProgramacion=Float.parseFloat(JOptionPane.showInputDialog("Ingrese Cantidad de Alumnos de Programación"));
		totAlu= (float) (aluMate + aluRedes + aluTaller + aluProgramacion);
		porMate= (float) ((aluMate*100)/totAlu);
		porRedes=(float) ((aluRedes*100)/totAlu);
		porTaller=(float) ((aluTaller*100)/totAlu);
		porProgramacion=(float) ((aluProgramacion*100)/totAlu);
		JOptionPane.showMessageDialog(null,"El porcentaje de alumnos de Matemáticas es de:" + porMate + "\n El total de alumnos de Redes es de:" + porRedes + "\n El porcentaje de alumnos de Taller de Base de Datos es de:" + porTaller + "\n El porcentaje de alumnos de Programación es de:" + porProgramacion);
	}
}