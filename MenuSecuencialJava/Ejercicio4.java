import javax.swing.JOptionPane;
public class Ejercicio4 {
      void invertirNum() {
           float cociente, residuo, num, numero;
          num=Float.parseFloat(JOptionPane.showInputDialog("ingrese un numero de dos cifras"));
          cociente=(byte)(num/10);
          residuo= (byte)(num % 10);
          numero= (byte)((residuo*10)+cociente);
          JOptionPane.showMessageDialog(null, " su numero inverso es :" + numero);
       }
} 