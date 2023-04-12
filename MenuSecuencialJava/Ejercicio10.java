import javax.swing.JOptionPane;
public class Ejercicio10 {
       void cobrarExtra () {
           float tarifa, horasDia, horasExtra, tarifaExtra, total;
           tarifa=Float.parseFloat(JOptionPane.showInputDialog("ingrese su tarifa por hora."));
           horasDia=Float.parseFloat(JOptionPane.showInputDialog("ingrese las horas trabajadas por dia"));
           horasExtra= (float)(horasDia-8);
		JOptionPane.showMessageDialog(null, " sus horas extras son:" + horasExtra);
		if (horasDia<8){
		JOptionPane.showMessageDialog(null, "no aplica horas extra");
           	
		}if(horasExtra>4){
           	JOptionPane.showMessageDialog(null, "no es posible trabajar mas de 4 horas extra");
          	tarifa=0;
		tarifaExtra=0;
          	}else {
		tarifaExtra=(float)((tarifa*horasExtra)*2);
           	JOptionPane.showMessageDialog(null, " el sueldo extra es de : $" + tarifaExtra);
        	}
                total=(float)((horasDia*tarifa) + tarifaExtra);
		total=(float)(total-200);
                JOptionPane.showMessageDialog(null, " tu sueldo total ed de :" + total);  
      }
}
		
                

          