import javax.swing.JOptionPane;
public class Ejercicio8{
      void convertirDolar () {
            float dolar, cantidad, totalDolar;
            cantidad=Short.parseShort(JOptionPane.showInputDialog("ingrese la cantidas de pesos ($)"));
            dolar=Short.parseShort(JOptionPane.showInputDialog("ingrese el valor del dolar "));
            totalDolar= (short)(cantidad*dolar);
            JOptionPane.showMessageDialog(null, " la cantidad de pesos en dolares es: " + totalDolar);
      }
}
 