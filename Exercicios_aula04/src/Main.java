import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Fracao fracao01 = new Fracao();

        fracao01.dbn1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
        fracao01.dbn2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor"));
        fracao01.dbn3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro valor"));

        JOptionPane.showMessageDialog(null, fracao01.retorno());

    }
}
