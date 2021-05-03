package mathClass;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double co;
        double ca;
        double hi;

        co = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do cateto oposto: "));
        ca = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do cateto adjacente: "));

        hi = Math.pow(ca, 2) + Math.pow(co, 2);
        hi = Math.sqrt(hi);



        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hi + "cm");
    }

}