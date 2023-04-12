import javax.swing.JOptionPane;
public class Ejercicio5{
      void repartirMonto () {
            float edadA, edadI, edadG, monto, suma, montoA, montoI, montoG;
            edadA=Float.parseFloat(JOptionPane.showInputDialog("ingrese la edad de Abigail"));
            edadI=Float.parseFloat(JOptionPane.showInputDialog("ingrese la edad de Imanol"));
            edadG=Float.parseFloat(JOptionPane.showInputDialog("ingrese la edad de Gusta"));
            monto=Float.parseFloat(JOptionPane.showInputDialog("ingrese el monto a repartir"));
            suma=edadA+edadI+edadG;
            montoA=(float)(monto*(edadA/suma));
            montoI=(float)(monto*(edadI/suma));
            montoG =(float)(monto*(edadG/suma)); 
            JOptionPane.showMessageDialog(null, " El monto para Abigail es de: $" + montoA + "\n el monto para Imanol es de:  $ " + montoI + "\n el monto para Gusta es de :  $" + montoG);
      }
}     