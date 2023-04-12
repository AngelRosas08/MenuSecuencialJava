import javax.swing.JOptionPane;
public class Ejercicio7{
      void convertirGrados () {
            float temperaturaC, temperaturaF;
            temperaturaC=Short.parseShort(JOptionPane.showInputDialog("ingrese la temperatura en grados celscius (°c)"));
            temperaturaF= (short)((temperaturaC*9/5)+32);
            JOptionPane.showMessageDialog(null, " la temperatura es: " + temperaturaF + "°F");
      }
}
 