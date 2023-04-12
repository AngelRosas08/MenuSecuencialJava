import javax.swing.JOptionPane;
public class Ejercicio6 {
      void invertir() {
           float inversion1, inversion2, inversion3, inversionTotal, porc1, porc2, porc3;
           inversion1=Float.parseFloat(JOptionPane.showInputDialog("ingrese la primera inversion"));
           inversion2=Float.parseFloat(JOptionPane.showInputDialog("ingrese la segunda inversion"));
           inversion3=Float.parseFloat(JOptionPane.showInputDialog("ingrese la tercera inversion"));
           inversionTotal=(float)(inversion1+inversion2+inversion3);
           JOptionPane.showMessageDialog(null, " la inversion total es de: $" + inversionTotal);
           porc1=(float)((inversion1/inversionTotal)*100);
           porc2=(float)((inversion2/inversionTotal)*100);
           porc3=(float)((inversion3/inversionTotal)*100);
          JOptionPane.showMessageDialog(null, " la primera inversion fue de:  %" + porc1 + "\n la segunda inversion fue de: % " + porc2 + "\n la tercera inversion fue de: %" + porc3);
      }
}
 
 
